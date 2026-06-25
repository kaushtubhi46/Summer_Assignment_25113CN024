import java.util.Scanner;
public class TrainTicketBookingSystem {
    static String getCoachType(int choice){
        if(choice == 1)
            return "Sleeper";
        else if(choice == 2)
            return "AC 3 Tier";
        else if(choice == 3)
            return "AC 2 Tier";
        else if(choice == 4)
            return "First AC";
        else
            return "Unknown";
    }
    static double getFare(int choice){
        if(choice == 1)
            return 500;
        else if(choice == 2)
            return 1000;
        else if(choice == 3)
            return 1500;
        else if(choice == 4)
            return 2500;
        else
            return 0;
    }
    static String getStatus(boolean cancelled){
        if(cancelled)
            return "Cancelled";
        else
            return "Confirmed";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trainNo[] = new int[100];
        String trainName[] = new String[100];
        String source[] = new String[100];
        String destination[] = new String[100];
        String runningDays[] = new String[100];
        String departureTime[] = new String[100];
        int availableSeats[] = new int[100];
        int pnr[] = new int[100];
        String passengerName[] = new String[100];
        int bookedTrainNo[] = new int[100];
        int bookedTrainIndex[] = new int[100];
        String coachType[] = new String[100];
        double fare[] = new double[100];
        boolean cancelled[] = new boolean[100];
        int trainCount = 0;
        int bookingCount = 0;
        int choice = 0;
        
        while(choice != 9){
            System.out.println("\n======================================================");
            System.out.println("          TRAIN TICKET BOOKING SYSTEM");
            System.out.println("======================================================");
            System.out.println("1. Add Train");
            System.out.println("2. View All Trains");
            System.out.println("3. Search Train By Number");
            System.out.println("4. Search Train By Route");
            System.out.println("5. Book Ticket");
            System.out.println("6. Search Ticket By PNR");
            System.out.println("7. Cancel Ticket");
            System.out.println("8. Booking Summary");
            System.out.println("9. Exit");
            System.out.println("======================================================");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1://add train.
                    if(trainCount == 100){
                        System.out.println("Train Record is Full!");
                        break;
                    }
                    System.out.print("Enter Train Number : ");
                    int newTrainNo = sc.nextInt();
                    int i = 0;
                    boolean exists = false;
                    while(i < trainCount){
                        if(trainNo[i] == newTrainNo){
                            exists = true;
                            break;
                        }
                        i++;
                    }
                    if(exists){
                        System.out.println("Train Number Already Exists!");
                        break;
                    }
                    trainNo[trainCount] = newTrainNo;
                    sc.nextLine();
                    System.out.print("Enter Train Name : ");
                    trainName[trainCount] = sc.nextLine();
                    System.out.print("Enter Source Station : ");
                    source[trainCount] = sc.nextLine();
                    System.out.print("Enter Destination Station : ");
                    destination[trainCount] = sc.nextLine();
                    System.out.print("Enter Running Days (Mon,Wed,Fri) : ");
                    runningDays[trainCount] = sc.nextLine();
                    System.out.print("Enter Departure Time : ");
                    departureTime[trainCount] = sc.nextLine();
                    System.out.print("Enter Available Seats : ");
                    availableSeats[trainCount] = sc.nextInt();
                    trainCount++;
                    System.out.println("\nTrain Added Successfully!");
                    break;
                case 2://view all trains.
                    if(trainCount == 0){
                        System.out.println("No Train Records Found!");
                        break;
                    }
                    System.out.println("\n==============================================================================================================");
                    System.out.printf("%-10s %-22s %-15s %-15s %-18s %-15s %-10s\n","Train No","Train Name","Source","Destination","Running Days","Time","Seats");
                    System.out.println("==============================================================================================================");
                    i = 0;
                    while(i < trainCount){
                        System.out.printf("%-10d %-22s %-15s %-15s %-18s %-15s %-10d\n",trainNo[i],trainName[i],source[i],destination[i],runningDays[i],departureTime[i],availableSeats[i]);
                        i++;
                    }
                    System.out.println("==============================================================================================================");
                    break;
                case 3://search train by number.
                    if(trainCount == 0){
                        System.out.println("No Train Records Found!");
                        break;
                    }
                    System.out.print("Enter Train Number : ");
                    int searchTrainNo = sc.nextInt();
                    i = 0;
                    boolean found = false;
                    while(i < trainCount){
                        if(trainNo[i] == searchTrainNo){
                            System.out.println("\n==========================================");
                            System.out.println("           TRAIN DETAILS");
                            System.out.println("==========================================");
                            System.out.println("Train Number    : " + trainNo[i]);
                            System.out.println("Train Name      : " + trainName[i]);
                            System.out.println("Source          : " + source[i]);
                            System.out.println("Destination     : " + destination[i]);
                            System.out.println("Running Days    : " + runningDays[i]);
                            System.out.println("Departure Time  : " + departureTime[i]);
                            System.out.println("Available Seats : " + availableSeats[i]);
                            System.out.println("==========================================");

                            found = true;
                            break;
                        }
                        i++;
                    }
                    if(!found){
                        System.out.println("Train Not Found!");
                    }
                    break;
                case 4://search train by route.
                    if(trainCount == 0){
                        System.out.println("No Train Records Found!");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Enter Source Station : ");
                    String searchSource = sc.nextLine();
                    System.out.print("Enter Destination Station : ");
                    String searchDestination = sc.nextLine();
                    i = 0;
                    found = false;
                    System.out.println("\n==============================================================================================================");
                    System.out.printf("%-10s %-22s %-15s %-15s %-18s %-15s %-10s\n","Train No","Train Name","Source","Destination","Running Days","Time","Seats");
                    System.out.println("==============================================================================================================");
                    while(i < trainCount){
                        if(source[i].equalsIgnoreCase(searchSource) && destination[i].equalsIgnoreCase(searchDestination)){
                            System.out.printf("%-10d %-22s %-15s %-15s %-18s %-15s %-10d\n",trainNo[i],trainName[i],source[i],destination[i],runningDays[i],departureTime[i],availableSeats[i]);
                            found = true;
                        }
                        i++;
                    }
                    System.out.println("==============================================================================================================");
                    if(!found){
                        System.out.println("No Trains Available For This Route!");
                    }
                    break;
                case 5://book ticket.
                    if(trainCount == 0){
                        System.out.println("No Train Records Found!");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Enter Source Station : ");
                    String bookSource = sc.nextLine();
                    System.out.print("Enter Destination Station : ");
                    String bookDestination = sc.nextLine();
                    int selectedIndex = -1;
                    System.out.println("\nAvailable Trains");
                    System.out.println("==============================================================================================================");
                    System.out.printf("%-10s %-22s %-15s %-15s %-18s %-15s %-10s\n", "Train No","Train Name","Source","Destination","Running Days","Time","Seats");
                    System.out.println("==============================================================================================================");
                    for(i = 0; i < trainCount; i++){
                        if(source[i].equalsIgnoreCase(bookSource)
                                && destination[i].equalsIgnoreCase(bookDestination)
                                && availableSeats[i] > 0){
                            System.out.printf("%-10d %-22s %-15s %-15s %-18s %-15s %-10d\n",
                                    trainNo[i], trainName[i], source[i],
                                    destination[i], runningDays[i],
                                    departureTime[i], availableSeats[i]);
                        }
                    }
                    System.out.println("==============================================================================================================");
                    System.out.print("Enter Train Number : ");
                    int selectedTrainNo = sc.nextInt();
                    for(i = 0; i < trainCount; i++){
                        if(trainNo[i] == selectedTrainNo){
                            selectedIndex = i;
                            break;
                        }
                    }
                    if(selectedIndex == -1){
                        System.out.println("Train Not Found!");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Enter Passenger Name : ");
                    passengerName[bookingCount] = sc.nextLine();
                    System.out.println("\nSelect Coach Type");
                    System.out.println("1. Sleeper      ₹500");
                    System.out.println("2. AC 3 Tier    ₹1000");
                    System.out.println("3. AC 2 Tier    ₹1500");
                    System.out.println("4. First AC     ₹2500");
                    System.out.print("Enter Choice : ");
                    int coachChoice = sc.nextInt();
                    if(coachChoice < 1 || coachChoice > 4){
                        System.out.println("Invalid Coach Choice!");
                        break;
                    }
                    pnr[bookingCount] = 10000 + bookingCount;
                    bookedTrainNo[bookingCount] = trainNo[selectedIndex];
                    bookedTrainIndex[bookingCount] = selectedIndex;
                    coachType[bookingCount] = getCoachType(coachChoice);
                    fare[bookingCount] = getFare(coachChoice);
                    cancelled[bookingCount] = false;
                    availableSeats[selectedIndex]--;
                    System.out.println("\n==================================================");
                    System.out.println("              TICKET BOOKED");
                    System.out.println("==================================================");
                    System.out.println("PNR            : " + pnr[bookingCount]);
                    System.out.println("Passenger Name : " + passengerName[bookingCount]);
                    System.out.println("Train Number   : " + trainNo[selectedIndex]);
                    System.out.println("Train Name     : " + trainName[selectedIndex]);
                    System.out.println("Coach Type     : " + coachType[bookingCount]);
                    System.out.println("Fare           : ₹" + fare[bookingCount]);
                    System.out.println("==================================================");
                    bookingCount++;
                    break;
                case 6://search ticket by pnr.
                    if(bookingCount == 0){
                        System.out.println("No Bookings Found!");
                        break;
                    }
                    System.out.print("Enter PNR Number : ");
                    int searchPNR = sc.nextInt();
                    boolean pnrFound = false;
                    for(i = 0; i < bookingCount; i++){
                        if(pnr[i] == searchPNR){
                            System.out.println("\n==================================================");
                            System.out.println("              TICKET DETAILS");
                            System.out.println("==================================================");
                            System.out.println("PNR            : " + pnr[i]);
                            System.out.println("Passenger Name : " + passengerName[i]);
                            System.out.println("Train Number   : " + bookedTrainNo[i]);
                            System.out.println("Train Name     : " + trainName[bookedTrainIndex[i]]);
                            System.out.println("Source         : " + source[bookedTrainIndex[i]]);
                            System.out.println("Destination    : " + destination[bookedTrainIndex[i]]);
                            System.out.println("Departure Time : " + departureTime[bookedTrainIndex[i]]);
                            System.out.println("Coach Type     : " + coachType[i]);
                            System.out.println("Fare           : ₹" + fare[i]);
                            System.out.println("Status         : " + getStatus(cancelled[i]));
                            System.out.println("==================================================");
                            pnrFound = true;
                            break;
                        }
                    }
                    if(!pnrFound){
                        System.out.println("PNR Not Found!");
                    }
                    break;
                case 7://cancel ticket.
                    if(bookingCount == 0){
                        System.out.println("No Bookings Found!");
                        break;
                    }
                    System.out.print("Enter PNR Number : ");
                    int cancelPNR = sc.nextInt();
                    boolean ticketFound = false;
                    for(i = 0; i < bookingCount; i++){
                        if(pnr[i] == cancelPNR){
                            if(cancelled[i]){
                                System.out.println("Ticket Already Cancelled!");
                            }
                            else{
                                cancelled[i] = true;
                                availableSeats[bookedTrainIndex[i]]++;
                                System.out.println("Ticket Cancelled Successfully!");
                            }
                            ticketFound = true;
                            break;
                        }
                    }
                    if(!ticketFound){
                        System.out.println("PNR Not Found!");
                    }
                    break;
                case 8://booking summary.
                    int activeTickets = 0;
                    int cancelledTickets = 0;
                    double totalRevenue = 0;
                    for(i = 0; i < bookingCount; i++){
                        if(cancelled[i])
                            cancelledTickets++;
                        else{
                            activeTickets++;
                            totalRevenue += fare[i];
                        }
                    }
                    System.out.println("\n==========================================");
                    System.out.println("           BOOKING SUMMARY");
                    System.out.println("==========================================");
                    System.out.println("Total Trains      : " + trainCount);
                    System.out.println("Total Bookings    : " + bookingCount);
                    System.out.println("Active Tickets    : " + activeTickets);
                    System.out.println("Cancelled Tickets : " + cancelledTickets);
                    System.out.printf("Total Revenue     : ₹%.2f\n", totalRevenue);
                    System.out.println("==========================================");
                    break;
                case 9://exit.
                    System.out.println("\nThank You for Using Train Ticket Booking System!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}