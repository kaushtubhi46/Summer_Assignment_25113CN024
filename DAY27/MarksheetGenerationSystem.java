import java.util.Scanner;
public class MarksheetGenerationSystem {
    static int getTotal(int english, int maths, int science, int computer){
        return english + maths + science + computer;
    }
    static double getPercentage(int total){
        return total/4.0;
    }
    static String getGrade(double percentage){
        if(percentage >= 90)
            return "A+";
        else if(percentage >= 80)
            return "A";
        else if(percentage >= 70)
            return "B";
        else if(percentage >= 60)
            return "C";
        else if(percentage >= 50)
            return "D";
        else
            return "F";
    }
    static String getResult(int english, int maths, int science, int computer){
        if(english >= 33 && maths >= 33 && science >= 33 && computer >= 33)
            return "PASS";
        else
            return "FAIL";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollNo[] = new int[100];
        String name[] = new String[100];
        int english[] = new int[100];
        int maths[] = new int[100];
        int science[] = new int[100];
        int computer[] = new int[100];
        int count = 0;
        int choice = 0;
        while(choice != 7){
            System.out.println("\n====================================================");
            System.out.println("          MARKSHEET GENERATION SYSTEM");
            System.out.println("====================================================");
            System.out.println("1. Add Student Record");
            System.out.println("2. View All Records");
            System.out.println("3. Generate Marksheet");
            System.out.println("4. Update Marks");
            System.out.println("5. Class Summary");
            System.out.println("6. Class Topper");
            System.out.println("7. Exit");
            System.out.println("====================================================");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1://add student record.
                    if(count == 100){
                        System.out.println("Record is full!!");
                        break;
                    }
                    System.out.print("Enter Roll Number : ");
                    int newRollNo = sc.nextInt();
                    int i = 0;
                    boolean exists = false;
                    while(i < count){
                        if(rollNo[i] == newRollNo){
                            exists = true;
                            break;
                        }
                        i++;
                    }
                    if(exists){
                        System.out.println("Roll Number Already Exists!");
                        break;
                    }
                    rollNo[count] =newRollNo;
                    sc.nextLine();
                    System.out.print("Enter Student Name : ");
                    name[count] = sc.nextLine();
                    System.out.print("Enter English Marks : ");
                    english[count] = sc.nextInt();
                    System.out.print("Enter Maths Marks : ");
                    maths[count] = sc.nextInt();
                    System.out.print("Enter Science Marks : ");
                    science[count] = sc.nextInt();
                    System.out.print("Enter Computer Marks : ");
                    computer[count] = sc.nextInt();
                    count++;
                    System.out.println("\nStudent Record Added Successfully!");
                    break;
                case 2://view all records.
                    if(count == 0){
                        System.out.println("No Student Record Found!");
                        break;
                    }
                    System.out.println("\n------------------------------------------------------------------------------------------------------------");
                    System.out.printf("%-8s %-18s %-8s %-8s %-8s %-10s %-8s %-10s %-8s %-8s\n","Roll","Name","Eng","Maths","Sci","Comp","Total","Percent","Grade","Result");
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    i = 0;
                    while(i < count){
                        int total = getTotal(english[i],maths[i],science[i],computer[i]);
                        double percentage = getPercentage(total);
                        String grade = getGrade(percentage);
                        String result = getResult(english[i],maths[i],science[i],computer[i]);
                        System.out.printf("%-8d %-18s %-8d %-8d %-8d %-10d %-8d %-10.2f %-8s %-8s\n",rollNo[i],name[i],english[i],maths[i],science[i],computer[i],total,percentage,grade,result);
                        i++;
                    }
                    System.out.println("------------------------------------------------------------------------------------------------------------");
                    break;
                case 3://generate marksheet.
                    System.out.print("Enter Roll Number : ");
                    int searchRoll = sc.nextInt();
                    i = 0;
                    boolean found = false;
                    while(i < count){
                        if(rollNo[i] == searchRoll){
                            int total = getTotal(english[i], maths[i], science[i], computer[i]);
                            double percentage = getPercentage(total);
                            String grade = getGrade(percentage);
                            String result = getResult(english[i], maths[i], science[i], computer[i]);
                            System.out.println("\n==================================================");
                            System.out.println("             STUDENT MARKSHEET");
                            System.out.println("==================================================");
                            System.out.println("Roll Number    : " + rollNo[i]);
                            System.out.println("Student Name   : " + name[i]);
                            System.out.println("--------------------------------------------------");
                            System.out.println("English        : " + english[i]);
                            System.out.println("Maths          : " + maths[i]);
                            System.out.println("Science        : " + science[i]);
                            System.out.println("Computer       : " + computer[i]);
                            System.out.println("--------------------------------------------------");
                            System.out.println("Total Marks    : " + total + "/400");
                            System.out.printf("Percentage     : %.2f%%\n", percentage);
                            System.out.println("Grade          : " + grade);
                            System.out.println("Result         : " + result);
                            System.out.println("==================================================");
                            found = true;
                            break;
                        }
                        i++;
                    }
                    if(!found){
                        System.out.println("Student Record Not Found!");
                    }
                    break;
                case 4://update marks.
                    System.out.print("Enter Roll Number : ");
                    int updateRoll = sc.nextInt();
                    i = 0;
                    boolean updated = false;
                    while(i < count){
                        if(rollNo[i] == updateRoll){
                            System.out.println("Current Marks");
                            System.out.println("English : " + english[i]);
                            System.out.println("Maths   : " + maths[i]);
                            System.out.println("Science : " + science[i]);
                            System.out.println("Computer: " + computer[i]);
                            System.out.println("\nEnter New Marks");
                            System.out.print("English : ");
                            english[i] = sc.nextInt();
                            System.out.print("Maths : ");
                            maths[i] = sc.nextInt();
                            System.out.print("Science : ");
                            science[i] = sc.nextInt();
                            System.out.print("Computer : ");
                            computer[i] = sc.nextInt();
                            System.out.println("\nMarks Updated Successfully!");
                            updated = true;
                            break;
                        }
                        i++;
                    }
                    if(!updated){
                        System.out.println("Student Record Not Found!");
                    }
                    break;
                case 5://class summary.
                    if(count == 0){
                        System.out.println("No Student Records Found!");
                        break;
                    }
                    int passed = 0;
                    int failed = 0;
                    double totalPercentage = 0;
                    i = 0;
                    while(i < count){
                        int total = getTotal(english[i], maths[i], science[i], computer[i]);
                        double percentage = getPercentage(total);
                        String result = getResult(english[i], maths[i], science[i], computer[i]);
                        totalPercentage += percentage;
                        if(result.equals("PASS"))
                            passed++;
                        else
                            failed++;
                        i++;
                    }
                    double averagePercentage = totalPercentage / count;
                    System.out.println("\n==========================================");
                    System.out.println("           CLASS SUMMARY");
                    System.out.println("==========================================");
                    System.out.println("Total Students : " + count);
                    System.out.println("Passed         : " + passed);
                    System.out.println("Failed         : " + failed);
                    System.out.printf("Average %%      : %.2f\n", averagePercentage);
                    System.out.println("==========================================");
                    break;
                case 6://class topper.
                    if(count == 0){
                        System.out.println("No Student Records Found!");
                        break;
                    }
                    int topperIndex = 0;
                    int highestTotal = getTotal(english[0],maths[0],science[0],computer[0]);
                    i = 1;
                    while(i < count){
                        int total = getTotal(english[i],maths[i],science[i],computer[i]);
                        if(total > highestTotal){
                            highestTotal = total;
                            topperIndex = i;
                        }
                        i++;
                    }
                    double topperPercentage = getPercentage(highestTotal);
                    String topperGrade = getGrade(topperPercentage);
                    String topperResult = getResult(english[topperIndex],maths[topperIndex],science[topperIndex],computer[topperIndex]);
                    System.out.println("\n==========================================");
                    System.out.println("            CLASS TOPPER");
                    System.out.println("==========================================");
                    System.out.println("Roll Number : " + rollNo[topperIndex]);
                    System.out.println("Name        : " + name[topperIndex]);
                    System.out.println("Total Marks : " + highestTotal + "/400");
                    System.out.printf("Percentage  : %.2f%%\n", topperPercentage);
                    System.out.println("Grade       : " + topperGrade);
                    System.out.println("Result      : " + topperResult);
                    System.out.println("==========================================");
                    break;
                case 7://exit.
                    System.out.println("\nThank You for Using Marksheet Generation System!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}