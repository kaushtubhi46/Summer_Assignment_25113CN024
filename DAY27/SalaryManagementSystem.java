import java.util.Scanner;
public class SalaryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[100];
        String empName[] = new String[100];
        double baseSalary[] = new double[100];

        int count = 0;
        int choice = 0;
        while(choice != 8){
            System.out.println("\n====================================================");
            System.out.println("            SALARY MANAGEMENT SYSTEM");
            System.out.println("====================================================");
            System.out.println("1. Add Salary Record");
            System.out.println("2. View Salary Records");
            System.out.println("3. Generate Salary Slip");
            System.out.println("4. Update Basic Salary");
            System.out.println("5. Bonus Calculator");
            System.out.println("6. Payroll Summary");
            System.out.println("7. Highest Net Salary");
            System.out.println("8. Exit");
            System.out.println("====================================================");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1://add salary record.
                    if(count == 100){
                        System.out.println("Salary Record is full!!");
                        break;
                    }
                    System.out.print("Enter Employee ID : ");
                    int newID = sc.nextInt();
                    int i = 0;
                    boolean exists = false;
                    while(i < count){//check duplicate employee ID.
                        if (id[i] == newID){
                            exists = true;
                            break;
                        }
                        i++;
                    }
                    if(exists){
                        System.out.println("Employee ID Already Exists!");
                        break;
                    }
                    id[count] = newID;
                    sc.nextLine();
                    System.out.print("Enter Employee Name : ");
                    empName[count] = sc.nextLine();
                    System.out.print("Enter Basic Salary : ");
                    baseSalary[count] = sc.nextDouble();
                    count++;
                    System.out.println("\nSalary Record Added Successfully!");
                    break;
                case 2://view salary record.
                    if(count == 0){
                        System.out.println("No Salary Records Found!");
                        break;
                    }
                    System.out.println("\n---------------------------------------------------------------------------------------------");
                    System.out.printf("%-8s %-20s %-12s %-12s %-12s %-12s %-12s\n","ID", "Name", "Basic", "HRA", "DA", "Tax", "Net");
                    System.out.println("---------------------------------------------------------------------------------------------");

                    i = 0;
                    while(i < count){
                        double hra = baseSalary[i] * 0.20;
                        double da = baseSalary[i] * 0.10;
                        double tax = baseSalary[i] * 0.05;
                        double netSalary = baseSalary[i] + hra + da - tax;
                        System.out.printf("%-8d %-20s %-12.2f %-12.2f %-12.2f %-12.2f %-12.2f\n",id[i],empName[i],baseSalary[i],hra,da,tax,netSalary);
                        i++;
                    }
                    System.out.println("---------------------------------------------------------------------------------------------");
                    break;
                case 3://generate basic salary.
                    System.out.print("Enter Employee ID : ");
                    int slipId = sc.nextInt();
                    i = 0;
                    boolean found = false;
                    while(i < count){
                        if(id[i] == slipId){
                            double hra = baseSalary[i] * 0.20;
                            double da = baseSalary[i] * 0.10;
                            double tax = baseSalary[i] * 0.05;
                            double netSalary = baseSalary[i] + hra + da - tax;
                            System.out.println("\n==================================================");
                            System.out.println("              EMPLOYEE SALARY SLIP");
                            System.out.println("==================================================");
                            System.out.println("Employee ID     : "+id[i]);
                            System.out.println("Employee Name   : "+empName[i]);
                            System.out.println("--------------------------------------------------");
                            System.out.printf("Basic Salary    : %.2f\n", baseSalary[i]);
                            System.out.printf("HRA (20%%)       : %.2f\n",hra);
                            System.out.printf("DA (10%%)        : %.2f\n",da);
                            System.out.printf("Tax (5%%)        : %.2f\n",tax);
                            System.out.printf("Net Salary      : %.2f\n",netSalary);
                            System.out.println("==================================================");
                            found = true;
                            break;
                        }
                        i++;
                    }
                    if(!found){
                        System.out.println("Employee Record Not Found!");
                    }
                    break;
                case 4://update basic salary.
                    System.out.print("Enter Employee ID : ");
                    int updateId = sc.nextInt();
                    i = 0;
                    boolean updated = false;
                    while(i < count){
                        if(id[i] ==updateId){
                            System.out.printf("Current Basic Salary : %.2f\n", baseSalary[i]);
                            System.out.print("Enter New Basic Salary : ");
                            baseSalary[i] = sc.nextDouble();
                            System.out.println("Salary Updated Successfully!");
                            updated = true;
                            break;
                        }
                        i++;
                    }
                    if(!updated){
                        System.out.println("Employee Record Not Found!");
                    }
                    break;
                case 5://bonus calculation.
                    System.out.print("Enter Employee ID : ");
                    int bonusId = sc.nextInt();
                    i = 0;
                    boolean bonusFound = false;
                    while(i < count){
                        if(id[i] == bonusId){
                            double bonus;
                            if(baseSalary[i] >= 100000)
                                bonus = baseSalary[i] * 0.15;
                            else if(baseSalary[i] >= 70000)
                                bonus = baseSalary[i] * 0.10;
                            else if(baseSalary[i] >= 50000)
                                bonus = baseSalary[i] * 0.07;
                            else
                                bonus = baseSalary[i] * 0.05;
                            System.out.println("\n=======================================");
                            System.out.println("          BONUS DETAILS");
                            System.out.println("=======================================");
                            System.out.println("Employee ID   : "+id[i]);
                            System.out.println("Employee Name : "+empName[i]);
                            System.out.printf("Basic Salary  : %.2f\n",baseSalary[i]);
                            System.out.printf("Bonus Amount  : %.2f\n",bonus);
                            System.out.println("=======================================");
                            bonusFound = true;
                            break;
                        }
                        i++;
                    }
                    if(!bonusFound){
                        System.out.println("Employee Record Not Found!");
                    }
                    break;
                case 6://Payroll summary.
                    if(count == 0){
                        System.out.println("No Salary Records Found!");
                        break;
                    }
                    double totalPayroll = 0;
                    double highestSalary = baseSalary[0] + (baseSalary[0]*0.20) + (baseSalary[0]*0.10) - (baseSalary[0]*0.05);
                    double lowestSalary = highestSalary;
                    i = 0;
                    while(i < count){
                        double hra = baseSalary[i] * 0.20;
                        double da = baseSalary[i] * 0.10;
                        double tax = baseSalary[i] * 0.05;
                        double netSalary = baseSalary[i] + hra + da - tax;
                        totalPayroll += netSalary;
                        if(netSalary > highestSalary){
                            highestSalary = netSalary;
                        }
                        if(netSalary < lowestSalary){
                            lowestSalary = netSalary;
                        }
                        i++;
                    }
                    double averageSalary = totalPayroll/count;
                    System.out.println("\n===============================================");
                    System.out.println("              PAYROLL SUMMARY");
                    System.out.println("===============================================");
                    System.out.println("Total Employees : " + count);
                    System.out.printf("Total Payroll   : %.2f\n", totalPayroll);
                    System.out.printf("Average Salary  : %.2f\n", averageSalary);
                    System.out.printf("Highest Salary  : %.2f\n", highestSalary);
                    System.out.printf("Lowest Salary   : %.2f\n", lowestSalary);
                    System.out.println("===============================================");
                    break;
                case 7://highest net salary.
                    if(count == 0){
                        System.out.println("No Salary Records Found!");
                        break;
                    }
                    int highestIndex = 0;
                    double maxNetSalary = baseSalary[0] + (baseSalary[0]*0.20) + (baseSalary[0]*0.10) - (baseSalary[0]*0.05);
                    i = 1;
                    while(i < count){
                        double hra = baseSalary[i] * 0.20;
                        double da = baseSalary[i] * 0.10;
                        double tax = baseSalary[i] * 0.05;
                        double netSalary = baseSalary[i] + hra + da - tax;
                        if(netSalary > maxNetSalary){
                            maxNetSalary = netSalary;
                            highestIndex = i;
                        }
                        i++;
                    }
                    System.out.println("\n===============================================");
                    System.out.println("            HIGHEST NET SALARY");
                    System.out.println("===============================================");
                    System.out.println("Employee ID   : " + id[highestIndex]);
                    System.out.println("Employee Name : " + empName[highestIndex]);
                    System.out.printf("Net Salary    : %.2f\n", maxNetSalary);
                    System.out.println("===============================================");
                    break;
                case 8://exit.
                    System.out.println("\nThank You for Using Salary Management System!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}