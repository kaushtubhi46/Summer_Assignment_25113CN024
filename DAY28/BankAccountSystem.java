import java.util.Scanner;
public class BankAccountSystem {
    static String getStatus(double balance){
        if(balance >= 1000)
            return "Active";
        else
            return "Low Balance";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountNo[] = new int[100];
        String holderName[] = new String[100];
        double balance[] = new double[100];
        int transactions[] = new int[100];
        int count = 0;
        int choice = 0;

        while(choice != 8){
            System.out.println("\n==============================================================");
            System.out.println("                  BANK ACCOUNT SYSTEM");
            System.out.println("==============================================================");
            System.out.println("1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Transfer Money");
            System.out.println("7. Bank Summary");
            System.out.println("8. Exit");
            System.out.println("==============================================================");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1://creat account.
                    if(count == 100){
                        System.out.println("Bank Record is Full!");
                        break;
                    }
                    System.out.print("Enter Account Number : ");
                    int newAccount = sc.nextInt();
                    int i = 0;
                    boolean exists = false;
                    while(i < count){
                        if(accountNo[i] == newAccount){
                            exists = true;
                            break;
                        }
                        i++;
                    }
                    if(exists){
                        System.out.println("Account Number Already Exists!");
                        break;
                    }
                    accountNo[count] = newAccount;
                    sc.nextLine();
                    System.out.print("Enter Account Holder Name : ");
                    holderName[count] = sc.nextLine();
                    System.out.print("Enter Initial Balance : ");
                    balance[count] = sc.nextDouble();
                    transactions[count] = 0;
                    count++;
                    System.out.println("\nAccount Created Successfully!");
                    break;
                case 2://view account.
                    if(count == 0){
                        System.out.println("No Account Found!");
                        break;
                    }
                    System.out.println("\n=========================================================================================================");
                    System.out.printf("%-12s %-25s %-15s %-15s %-15s\n","Account No","Holder Name","Balance","Status","Transactions");
                    System.out.println("=========================================================================================================");
                    i = 0;
                    while(i < count){
                        System.out.printf("%-12d %-25s %-15.2f %-15s %-15d\n",accountNo[i],holderName[i],balance[i],getStatus(balance[i]),transactions[i]);
                        i++;
                    }
                    System.out.println("=========================================================================================================");
                    break;
                case 3://deposit money.
                    if(count == 0){
                        System.out.println("No Account Found!");
                        break;
                    }
                    System.out.print("Enter Account Number : ");
                    int depositAcc = sc.nextInt();
                    i = 0;
                    boolean depositFound = false;
                    while(i < count){
                        if(accountNo[i] == depositAcc){
                            System.out.printf("Current Balance : %.2f\n", balance[i]);
                            System.out.print("Enter Deposit Amount : ");
                            double depositAmount = sc.nextDouble();
                            balance[i] += depositAmount;
                            transactions[i]++;
                            System.out.println("\nAmount Deposited Successfully!");
                            System.out.printf("Updated Balance : %.2f\n", balance[i]);
                            depositFound = true;
                            break;
                        }
                        i++;
                    }
                    if(!depositFound){
                        System.out.println("Account Not Found!");
                    }
                    break;
                case 4://withdraw money.
                    if(count == 0){
                        System.out.println("No Account Found!");
                        break;
                    }
                    System.out.print("Enter Account Number : ");
                    int withdrawAcc = sc.nextInt();
                    i = 0;
                    boolean withdrawFound = false;
                    while(i < count){
                        if(accountNo[i] == withdrawAcc){
                            System.out.printf("Current Balance : %.2f\n", balance[i]);
                            System.out.print("Enter Withdraw Amount : ");
                            double withdrawAmount = sc.nextDouble();
                            if(withdrawAmount > balance[i]){
                                System.out.println("Insufficient Balance!");
                            }
                            else if(balance[i] - withdrawAmount < 500){
                                System.out.println("Minimum Balance of 500 Must Be Maintained!");
                            }
                            else{
                                balance[i] -= withdrawAmount;
                                transactions[i]++;
                                System.out.println("\nAmount Withdrawn Successfully!");
                                System.out.printf("Remaining Balance : %.2f\n", balance[i]);
                            }
                            withdrawFound = true;
                            break;
                        }
                        i++;
                    }
                    if(!withdrawFound){
                        System.out.println("Account Not Found!");
                    }
                    break;
                case 5://check balance.
                    if(count == 0){
                        System.out.println("No Account Found!");
                        break;
                    }
                    System.out.print("Enter Account Number : ");
                    int searchAcc = sc.nextInt();
                    i = 0;
                    boolean found = false;
                    while(i < count){
                        if(accountNo[i] == searchAcc){
                            System.out.println("\n========================================");
                            System.out.println("         ACCOUNT DETAILS");
                            System.out.println("========================================");
                            System.out.println("Account Number : " + accountNo[i]);
                            System.out.println("Holder Name    : " + holderName[i]);
                            System.out.printf("Balance        : %.2f\n", balance[i]);
                            System.out.println("Status         : " + getStatus(balance[i]));
                            System.out.println("Transactions   : " + transactions[i]);
                            System.out.println("========================================");
                            found = true;
                            break;
                        }
                        i++;
                    }
                    if(!found){
                        System.out.println("Account Not Found!");
                    }
                    break;
                case 6://transfer money.
                    if(count == 0){
                        System.out.println("No Account Found!");
                        break;
                    }
                    System.out.print("Enter Sender Account Number : ");
                    int senderAcc = sc.nextInt();
                    System.out.print("Enter Receiver Account Number : ");
                    int receiverAcc = sc.nextInt();
                    int senderIndex = -1;
                    int receiverIndex = -1;
                    i = 0;
                    while(i < count){
                        if(accountNo[i] == senderAcc){
                            senderIndex = i;
                        }
                        if(accountNo[i] == receiverAcc){
                            receiverIndex = i;
                        }
                        i++;
                    }
                    if(senderIndex == -1 || receiverIndex == -1){
                        System.out.println("Invalid Account Number!");
                        break;
                    }
                    System.out.print("Enter Transfer Amount : ");
                    double transferAmount = sc.nextDouble();
                    if(transferAmount > balance[senderIndex]){
                        System.out.println("Insufficient Balance!");
                    }
                    else if(balance[senderIndex] - transferAmount < 500){
                        System.out.println("Minimum Balance of 500 Must Be Maintained!");
                    }
                    else{
                        balance[senderIndex] -= transferAmount;
                        balance[receiverIndex] += transferAmount;
                        transactions[senderIndex]++;
                        transactions[receiverIndex]++;
                        System.out.println("\nMoney Transferred Successfully!");
                    }
                    break;
                case 7://bank summary.
                    if(count == 0){
                        System.out.println("No Account Found!");
                        break;
                    }
                    double totalBalance = 0;
                    double highestBalance = balance[0];
                    double lowestBalance = balance[0];
                    i = 0;
                    while(i < count){
                        totalBalance += balance[i];
                        if(balance[i] > highestBalance){
                            highestBalance = balance[i];
                        }
                        if(balance[i] < lowestBalance){
                            lowestBalance = balance[i];
                        }
                        i++;
                    }
                    double averageBalance = totalBalance / count;
                    System.out.println("\n===============================================");
                    System.out.println("               BANK SUMMARY");
                    System.out.println("===============================================");
                    System.out.println("Total Accounts : " + count);
                    System.out.printf("Total Balance  : %.2f\n", totalBalance);
                    System.out.printf("Highest Balance: %.2f\n", highestBalance);
                    System.out.printf("Lowest Balance : %.2f\n", lowestBalance);
                    System.out.printf("Average Balance: %.2f\n", averageBalance);
                    System.out.println("===============================================");
                    break;
                case 8://exit.
                    System.out.println("\nThank You for Using Bank Account System!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}