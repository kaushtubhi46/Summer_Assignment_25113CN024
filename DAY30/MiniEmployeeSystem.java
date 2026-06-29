import java.util.Scanner;
public class MiniEmployeeSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id[] = new int[100];
        double salary[] = new double[100];
        String empName[] = new String[100];
        int attendance[] = new int[100];
        String department[] = new String[100];

        int count = 0;
        int choice = 0;
        while(choice != 4){
                System.out.println("\n========================================================");
                System.out.println("                MINI EMPLOYEE SYSTEM");
                System.out.println("========================================================");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Search Employee");
                System.out.println("4. Exit");
                System.out.println("========================================================");
                System.out.print("Enter Your Choice : ");
                choice = sc.nextInt();

            switch(choice){
                case 1://add employee
                    if(count == 100){
                        System.out.println("Employee record is full!!");
                        break;
                    }
                    System.out.print("Enter Employee ID : ");
                    int newID = sc.nextInt();
                    int i = 0;
                    boolean exists = false;
                    while(i < count){
                        if(id[i] == newID){
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
                    System.out.print("Enter Department : ");
                    department[count] = sc.nextLine();
                    System.out.print("Enter Monthly Salary : ");
                    salary[count] = sc.nextDouble();
                    System.out.print("Enter Attendance Percentage : ");
                    attendance[count] = sc.nextInt();
                    count++;
                    System.out.println("\nEmployee Added Sucessfully!");
                    break;
                case 2://view all employees.
                    if(count == 0){
                        System.out.println("No Employee Record Found !!");
                        break;
                    }
                    System.out.println("\n--------------------------------------------------------------------------------------------");
                    System.out.printf("%-8s %-20s %-15s %-15s %-15s\n","ID", "Name", "Department", "Salary", "Attendance");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    i = 0;
                    while(i < count){
                        System.out.printf("%-8d %-20s %-15s %-15.2f %-15d\n",id[i],empName[i],department[i],salary[i],attendance[i]);
                        i++;
                    }
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                case 3://search employee
                    System.out.print("Enter Employee ID to Search : ");
                    int searchID = sc.nextInt();
                    i = 0;
                    boolean found = false;
                    while(i < count){
                        if(id[i] == searchID){
                            System.out.println("\n========================================");
                            System.out.println("         EMPLOYEE DETAILS");
                            System.out.println("========================================");
                            System.out.println("Employee ID        : " + id[i]);
                            System.out.println("Employee Name      : " + empName[i]);
                            System.out.println("Department         : " + department[i]);
                            System.out.println("Monthly Salary     : " + salary[i]);
                            System.out.println("Attendance         : " + attendance[i] + "%");
                            System.out.println("========================================"); 

                            found = true;
                            break;
                        }
                        i++;
                    }    
                    if(!found){
                        System.out.println("Employee Record Not Found!!");
                    }
                    break;
                case 4:
                    System.out.println("\nThank You for Using Mini Employee System!");
                    break;
                default :
                    System.out.println("Invalid Choice! Please Try Again.");
            }  
        }  
        sc.close();
    }
}