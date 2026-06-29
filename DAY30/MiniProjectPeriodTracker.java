import java.util.Scanner;
import java.util.Random;
public class MiniProjectPeriodTracker {
    //add cycle record.
    static int addRecord(String startDate[], int cycleLength[],int periodDays[], String mood[], String symptoms[],String flowLevel[], int count, Scanner sc){
        if(count == 100){
            System.out.println("Tracker is Full!");
            return count;
        }
        System.out.print("Enter Start Date (DD-MM-YYYY) : ");
        String newDate = sc.nextLine();
        int i = 0;
        boolean exists = false;
        while(i < count){
            if(startDate[i].equals(newDate)){
                exists = true;
                break;
            }
            i++;
        }
        if(exists){
            System.out.println("Record Already Exists!");
            return count;
        }
        startDate[count] = newDate;
        System.out.print("Enter Cycle Length (Days) : ");
        cycleLength[count] = sc.nextInt();
        System.out.print("Enter Period Duration (Days) : ");
        periodDays[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Mood : ");
        mood[count] = sc.nextLine();
        System.out.print("Enter Main Symptom : ");
        symptoms[count] = sc.nextLine();
        System.out.print("Enter Blood Flow (Spotting/Light/Medium/Heavy/Very Heavy) : ");
        flowLevel[count] = sc.nextLine();
        count++;
        System.out.println("\nCycle Record Added Successfully!");
        return count;
    }
    //view records.
    static void viewRecords(String startDate[], int cycleLength[],int periodDays[], String mood[], String symptoms[],String flowLevel[], int count){
        if(count == 0){
            System.out.println("No Records Found!");
            return;
        }
        System.out.println("\n==============================================================================================================");
        System.out.printf("%-15s %-10s %-12s %-15s %-20s %-15s\n","Start Date","Cycle","Duration","Mood","Symptom","Blood Flow");
        System.out.println("==============================================================================================================");
        int i = 0;
        while(i < count){
            System.out.printf("%-15s %-10d %-12d %-15s %-20s %-15s\n",startDate[i], cycleLength[i], periodDays[i],mood[i], symptoms[i], flowLevel[i]);
            i++;
        }
        System.out.println("==============================================================================================================");
        System.out.println("Total Records : " + count);
    }
    //search record.
    static void searchRecord(String startDate[], int cycleLength[],int periodDays[], String mood[], String symptoms[],String flowLevel[], int count, Scanner sc){
        if(count == 0){
            System.out.println("No Records Found!");
            return;
        }
        System.out.print("Enter Start Date (DD-MM-YYYY) : ");
        String searchDate = sc.nextLine();
        int i = 0;
        boolean found = false;
        while(i < count){
            if(startDate[i].equals(searchDate)){
                System.out.println("\n==============================================");
                System.out.println("            PERIOD RECORD");
                System.out.println("==============================================");
                System.out.println("Start Date      : " + startDate[i]);
                System.out.println("Cycle Length    : " + cycleLength[i] + " Days");
                System.out.println("Period Duration : " + periodDays[i] + " Days");
                System.out.println("Mood            : " + mood[i]);
                System.out.println("Main Symptom    : " + symptoms[i]);
                System.out.println("Blood Flow      : " + flowLevel[i]);
                System.out.println("==============================================");
                found = true;
                break;
            }
            i++;
        }
        if(!found){
            System.out.println("Record Not Found!");
        }
    }
    //predict next period.
    static void predictNextPeriod(String startDate[], int cycleLength[], int count){
        if(count == 0){
            System.out.println("No Records Found!");
            return;
        }
        int last = count - 1;
        System.out.println("\n==============================================");
        System.out.println("         NEXT PERIOD PREDICTION");
        System.out.println("==============================================");
        System.out.println("Last Period Start : " + startDate[last]);
        System.out.println("Cycle Length      : " + cycleLength[last] + " Days");
        System.out.println();
        System.out.println("Predicted Next Period :");
        System.out.println("Approximately after " + cycleLength[last] + " days.");
        System.out.println("(Use a calendar to find the exact date.)");
        System.out.println("==============================================");
    }
    //average cycle length.
    static void averageCycle(int cycleLength[], int count){
        if(count == 0){
            System.out.println("No Records Found!");
            return;
        }
        int total = 0;
        int i = 0;
        while(i < count){
            total += cycleLength[i];
            i++;
        }
        double average = (double)total / count;
        System.out.println("\n==============================================");
        System.out.println("        AVERAGE CYCLE LENGTH");
        System.out.println("==============================================");
        System.out.printf("Average Cycle Length : %.2f Days\n", average);
        if(average >= 21 && average <= 35)
            System.out.println("Status : Normal Cycle");
        else
            System.out.println("Status : Irregular Cycle");
        System.out.println("==============================================");
    }
    //cycle length chart.
    static void cycleChart(String startDate[], int cycleLength[], int count){
        if(count == 0){
            System.out.println("No Records Found!");
            return;
        }
        System.out.println("\n============= CYCLE LENGTH CHART =============");
        int i = 0;
        while(i < count){
            System.out.print(startDate[i] + "  ");
            int j = 0;
            while(j < cycleLength[i]){
                System.out.print("█");
                j++;
            }
            System.out.println(" " + cycleLength[i] + " Days");
            i++;
        }
        System.out.println("==============================================");
    }
    //blood flow summary.
    static void bloodFlowSummary(String flowLevel[], int count){
        if(count == 0){
            System.out.println("No Records Found!");
            return;
        }
        int spotting = 0;
        int light = 0;
        int medium = 0;
        int heavy = 0;
        int veryHeavy = 0;
        int i = 0;
        while(i < count){
            if(flowLevel[i].equalsIgnoreCase("Spotting"))
                spotting++;
            else if(flowLevel[i].equalsIgnoreCase("Light"))
                light++;
            else if(flowLevel[i].equalsIgnoreCase("Medium"))
                medium++;
            else if(flowLevel[i].equalsIgnoreCase("Heavy"))
                heavy++;
            else if(flowLevel[i].equalsIgnoreCase("Very Heavy"))
                veryHeavy++;
            i++;
        }
        System.out.println("\n============= BLOOD FLOW SUMMARY =============");
        System.out.print("Spotting     ");
        i = 0;
        while(i < spotting){
            System.out.print("█");
            i++;
        }
        System.out.println(" " + spotting);

        System.out.print("Light        ");
        i = 0;
        while(i < light){
            System.out.print("█");
            i++;
        }
        System.out.println(" " + light);

        System.out.print("Medium       ");
        i = 0;
        while(i < medium){
            System.out.print("█");
            i++;
        }
        System.out.println(" " + medium);

        System.out.print("Heavy        ");
        i = 0;
        while(i < heavy){
            System.out.print("█");
            i++;
        }
        System.out.println(" " + heavy);

        System.out.print("Very Heavy   ");
        i = 0;
        while(i < veryHeavy){
            System.out.print("█");
            i++;
        }
        System.out.println(" " + veryHeavy);

        System.out.println("==============================================");
    }
    //tips to reduce cramps.
    static void crampTips(){
        System.out.println("\n========== TIPS TO REDUCE CRAMPS ==========");
        System.out.println("1. Drink plenty of water.");
        System.out.println("2. Use a heating pad.");
        System.out.println("3. Eat healthy food.");
        System.out.println("4. Do light exercise.");
        System.out.println("5. Get enough sleep.");
        System.out.println("6. Reduce caffeine.");
        System.out.println("7. Consult a doctor if pain is severe.");
        System.out.println("===========================================");
    }
    //healthy food suggestions.
    static void healthyFood(){
        System.out.println("\n======= HEALTHY FOOD SUGGESTIONS =======");
        System.out.println("• Bananas");
        System.out.println("• Spinach");
        System.out.println("• Yogurt");
        System.out.println("• Dark Chocolate");
        System.out.println("• Nuts");
        System.out.println("• Ginger Tea");
        System.out.println("• Fish");
        System.out.println("========================================");
    }
    //motivational quote.
    static void motivationalQuote(Random random){
        String quotes[] = {
            "Your body is strong. Take care of it.",
            "Every cycle is different. Be kind to yourself.",
            "Rest is also productive.",
            "Small self-care habits make a big difference.",
            "You are stronger than you think.",
            "Health comes first. Always.",
            "Keep smiling. Better days are ahead.",
            "Take one day at a time."
        };
        int index = random.nextInt(quotes.length);
        System.out.println("\n==============================================");
        System.out.println("Thank You for Using Period Tracker!");
        System.out.println("----------------------------------------------");
        System.out.println(quotes[index]);
        System.out.println("==============================================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String startDate[] = new String[100];
        int cycleLength[] = new int[100];
        int periodDays[] = new int[100];
        String mood[] = new String[100];
        String symptoms[] = new String[100];
        String flowLevel[] = new String[100];
        int count = 0;
        int choice = 0;

        while(choice != 10){
            System.out.println("\n=========================================================");
            System.out.println("                  PERIOD TRACKER SYSTEM");
            System.out.println("=========================================================");
            System.out.println("1. Add Cycle Record");
            System.out.println("2. View Records");
            System.out.println("3. Search Record");
            System.out.println("4. Predict Next Period");
            System.out.println("5. Average Cycle Length");
            System.out.println("6. Cycle Length Chart");
            System.out.println("7. Blood Flow Summary");
            System.out.println("8. Tips to Reduce Cramps");
            System.out.println("9. Healthy Food Suggestions");
            System.out.println("10. Exit");
            System.out.println("=========================================================");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1://add cycle record.
                    count = addRecord(startDate,cycleLength,periodDays,mood,symptoms,flowLevel,count,sc);
                    break;
                case 2://view records.
                    viewRecords(startDate, cycleLength,
                            periodDays, mood, symptoms,
                            flowLevel, count);
                    break;
                case 3://search record.
                    searchRecord(startDate,cycleLength,periodDays,mood,symptoms,flowLevel,count,sc);
                    break;
                case 4://predict next period.
                    predictNextPeriod(startDate, cycleLength, count);
                    break;
                case 5://average cycle length.
                    averageCycle(cycleLength, count);
                    break;
                case 6://cycle length chart.
                    cycleChart(startDate, cycleLength, count);
                    break;
                case 7://blood flow summary.
                    bloodFlowSummary(flowLevel, count);
                    break;
                case 8://tips to reduce cramps.
                    crampTips();
                    break;
                case 9://healthy food suggestions.
                    healthyFood();
                    break;
                case 10://exit.
                    motivationalQuote(random);
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}