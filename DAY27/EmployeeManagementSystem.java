import java.util.Scanner;
public class EmployeeManagementSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id[] = new int[100];
        double salary[] = new double[100];
        String empName[] = new String[100];
        int attendance[] = new int[100];
        String department[] = new String[100];

        int count = 0;
        int choice = 0;
    while(choice != 9){
            System.out.println("\n========================================================");
            System.out.println("           EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("========================================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Total Employees");
            System.out.println("7. View Department Employees");
            System.out.println("8. Generate Salary Slip");
            System.out.println("9. Exit");
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
            case 4://update salary.
                System.out.print("Enter Employee ID : ");
                int updateID = sc.nextInt();
                i = 0;
                boolean updated = false;
                while(i < count){
                    if(id[i] == updateID){
                        System.out.println("Current Salary : "+salary[i]);
                        System.out.print("Enter New Salary : ");
                        salary[i] = sc.nextDouble();
                        System.out.println("Salary Updated Successfully!");

                        updated = true;
                        break;
                    }
                    i++;
                }
                if(!updated){
                    System.out.println("Employee Record Not Found!!");
                }
                break;
            case 5://delete employee
                System.out.print("Enter Employee ID : ");
                int deleteID = sc.nextInt();
                i = 0;
                boolean deleted = false;
                while(i < count){
                    if(id[i] == deleteID){
                        int j = i;
                        while (j < count-1){
                            id[j] = id[j+1];
                            empName[j] = empName[j+1];
                            department[j] = department[j+1];
                            salary[j] = salary[j+1];
                            attendance[j] = attendance[j+1];
                            j++;
                        }
                        count--;
                        deleted = true;
                        System.out.println("Employee Deleted Successfully!");
                        break;
                    }
                    i++;
                }
                if(!deleted){
                    System.out.println("Employee Record Not Found!!");
                }
                break;
        case 6://show total number of employee.
            System.out.println("\nTotal Employees : "+ count);
            break;
        case 7:
            sc.nextLine();
            System.out.print("Enter Department Name : ");
            String depart = sc.nextLine();

            i = 0;
            boolean depFound = false;
            System.out.println("\n--------------------------------------------------------------------------");
            System.out.printf("%-8s %-20s %-15s %-15s\n","ID", "Name", "Salary", "Attendance");
            System.out.println("--------------------------------------------------------------------------");
            while(i < count){
                if(department[i].equalsIgnoreCase(depart)){
                    System.out.printf("%-8d %-20s %-15.2f %-15d\n",id[i],empName[i],salary[i],attendance[i]);

                    depFound = true;
                }
                i++;
            }
            System.out.println("--------------------------------------------------------------------------");
            if(!depFound){
                System.out.println("No Employees found in "+depart+" Department.");
            }
            break;
        case 8://generate salary slip.
            System.out.print("Enter Employee ID : ");
            int slipID = sc.nextInt();

            i = 0;
            boolean slipFound = false;

            while(i < count){
                if(id[i] == slipID){
                    double bonus = salary[i]*0.10;
                    double tax = salary[i]*0.05;
                    double netSalary = salary[i] + bonus - tax;
                    System.out.println("\n==================================================");
                    System.out.println("              EMPLOYEE SALARY SLIP");
                    System.out.println("==================================================");
                    System.out.println("Employee ID        : " + id[i]);
                    System.out.println("Employee Name      : " + empName[i]);
                    System.out.println("Department         : " + department[i]);
                    System.out.println("Attendance         : " + attendance[i] + "%");
                    System.out.println("--------------------------------------------------");
                    System.out.printf("Basic Salary       : %.2f\n", salary[i]);
                    System.out.printf("Bonus (10%%)        : %.2f\n", bonus);
                    System.out.printf("Tax (5%%)           : %.2f\n", tax);
                    System.out.printf("Net Salary         : %.2f\n", netSalary);
                    System.out.println("==================================================");
                    slipFound = true;
                    break;
                }
                i++;
            }
            if(!slipFound){
                System.out.println("Employee Record Not Found!!");
            }
            break;
        case 9:
            System.out.println("\nThank You for Using Employee Management System!");
            break;
        default :
            System.out.println("Invalid Choice! Please Try Again.");
        }  
    }  
        sc.close();
    }
}