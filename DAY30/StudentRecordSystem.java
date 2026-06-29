import java.util.Scanner;
public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //arrays to store roll numbers, names and marks of students.
        int roll[] = new int[100];
        String names[] = new String[100];
        int marks[] = new int[100];
        int count = 0;//stores current no. of students.
        int choice = 0;//for the menu option.
        while(choice != 4){//loop continues until user chooses to exit.
            System.out.println("\n======================================================");
            System.out.println("               STUDENT RECORD SYSTEM");
            System.out.println("======================================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.println("======================================================");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();//menu choice taken from user.
            switch (choice){
                case 1://add new student to record.
                    if(count == 100){
                        System.out.println("Record is full!");
                        break;
                    }
                    System.out.print("Enter Roll Number : ");
                    int newRoll = sc.nextInt();
                    int i = 0;
                    boolean exists = false;
                    while(i < count){
                        if(roll[i]==newRoll){
                            exists = true;
                            break;
                        }
                        i++;
                    }
                    if(exists){
                        System.out.println("Roll Number Already Exists!");
                        break;
                    }
                    roll[count] = newRoll;
                    sc.nextLine();
                    System.out.print("Enter Student Name : ");
                    names[count] = sc.nextLine();
                    System.out.print("Enter Student Marks : ");
                    marks[count] = sc.nextInt();
                    count++;
                    System.out.println("\nStudent Added Successfully!");
                    break;
                case 2://view student.
                    if(count==0){
                        System.out.println("No Student Record found!");
                        break;
                    }
                    System.out.println("\n----------------------------------------------------------------");
                    System.out.printf("%-10s %-20s %-10s %-10s\n","Roll No", "Name", "Marks", "Grade");
                    System.out.println("----------------------------------------------------------------");
                    i = 0;
                    while (i < count){
                        String grade;
                        if(marks[i] >= 95)
                            grade = "A+";
                        else if(marks[i] >= 90)
                            grade = "A";
                        else if(marks[i] >= 80)
                            grade = "B+";
                        else if(marks[i] >= 70)
                            grade = "B";
                        else if(marks[i] >= 60)
                            grade = "C";
                        else
                            grade = "F";
                        System.out.printf("%-10d %-20s %-10d %-10s\n",roll[i], names[i], marks[i], grade);
                        i++;
                    }
                    System.out.println("----------------------------------------------------------------");
                    break;
                case 3://search student.
                    System.out.print("Enter Roll Number to Search : ");
                    int searchRoll = sc.nextInt();
                    i = 0;
                    boolean found = false;
                    while(i<count){
                        if(roll[i] == searchRoll){
                            String grade;
                            if(marks[i] >= 95)
                                grade = "A+";
                            else if(marks[i] >= 90)
                                grade = "A";
                            else if(marks[i] >= 80)
                                grade = "B+";
                            else if(marks[i] >= 70)
                                grade = "B";
                            else if(marks[i] >= 60)
                                grade = "C";
                            else
                                grade = "F";
                            System.out.println("\nStudent Found");
                            System.out.println("--------------------------------");
                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name        : " + names[i]);
                            System.out.println("Marks       : " + marks[i]);
                            System.out.println("Grade       : " + grade);
                            found = true;
                            break;
                        }
                        i++;
                    }
                    if(!found){
                        System.out.println("Student Record Not Found!");
                    }
                    break;
            case 4://exit the menu.
                System.out.println("\nThank You for Using Student Record System!");
                break;
            default:
                System.out.println("Invalid Choice. Please Try Again.");
            }
        }
        sc.close();
    }
}