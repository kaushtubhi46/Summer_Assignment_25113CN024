import java.util.Scanner;
public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;//correct ATM pin.
        int maxAttempts = 3;//maximum login attempts allowed.
        int attempts = 0;//count number of attempts made.
        int choice = 0;//stores the menu choice.
        double balance = 8000;//initial account balance.
        while(attempts<maxAttempts){//allow pin entry until number of attempts are over.
            System.out.print("\t\t\t\t\tEnter ATM Pin : ");
            int atmPIN = sc.nextInt();//take pin input.
            if(atmPIN==pin){//checks if pin is correct.
                System.out.println("\t\t\t\t\t!!!Login successful!!!");
                break;//exit login loop.
            }
            attempts++;//increase attempt count when wrong pin written.
            System.out.println("\t\t\t\t\tIncorrect pin");
            System.out.println("\t\t\t\t\tNumber of attempts left : "+(maxAttempts-attempts));
            }
            if(attempts==maxAttempts){//block the card after 3 wrong attempts.
            System.out.println("\t\t\t\t\tCard Blocked");
            sc.close();
            return;//end program.
            }
            char again = 'Y';
            while(again == 'y'|| again == 'Y'){//shown once and then when user wants it.
                System.out.println("\n\t\t\t\t\t\t===== ATM MENU =====");
                System.out.println("\t\t\t\t\t1. Check Balance");
                System.out.println("\t\t\t\t\t2. Deposit");
                System.out.println("\t\t\t\t\t3. Withdraw");
                System.out.print("\t\t\t\t\tEnter Choice: ");
                choice = sc.nextInt();//take choice form user.
                switch(choice){
                    case 1:
                        System.out.println("\t\t\t\t\tCurrent Balance : ₹"+balance);
                        break;
                    case 2:
                        System.out.print("\t\t\t\t\tEnter amount to deposit : ₹");
                        double deposit = sc.nextDouble();//take deposit.
                        if(deposit<=0){//vaidation first.
                            System.out.println("\t\t\t\t\tInvalid Amount!!");
                        }
                        else{
                        balance += deposit;
                        System.out.println("\t\t\t\t\tDeposit successful!");
                        System.out.println("\t\t\t\t\tUpdated Balance : "+balance);
                        }
                        break;
                    case 3:
                        System.out.print("\t\t\t\t\tEnter amount to withdraw : ₹");
                        double withdraw = sc.nextDouble();//take withdrawal amount.
                        if(withdraw<=0){//validation first.
                            System.out.println("\t\t\t\t\tInvalid Amount!!");
                        }
                        else if(balance>=withdraw){//check for suffecient balance.
                        balance -= withdraw;//deduct amount.
                        System.out.println("\t\t\t\t\tWithdrawal Succesful!");
                        System.out.println("\t\t\t\t\tRemaining balance : ₹"+balance);
                        }  
                        else{
                            System.out.println("\t\t\t\t\tInsufficient Balance!!");
                        } 
                        break;
                    default:
                        System.out.println("\t\t\t\t\tInvalid Choice!");
                }
                System.out.print("\n\t\t\t\t\tReturn to Menu? (Y/N): ");//to show the menu again.
                again = sc.next().charAt(0);//take user's response.
            }
            System.out.println("\t\t\t\t\t!!!Thank You For Using The ATM!!!");
        sc.close();
    }
}