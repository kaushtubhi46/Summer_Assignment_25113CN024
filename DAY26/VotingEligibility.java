import java.util.Scanner;
    public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Voting Eligibility System=====");
        System.out.print("Enter Name : ");
        String name = sc.nextLine();//take the name input from user.
        System.out.print("Enter Age : ");
        int age = sc.nextInt();//take the age input from user.
        System.out.print("Do you have a Voter ID ? (Yes/No): ");
        String voterID = sc.next();//check for voterID status.
        //check for voting eligibility.
        if(age>=18 && voterID.equalsIgnoreCase("Yes")){//check if user is above 18 and has a voter ID.
            System.out.println("Status : "+name+" is eligible to vote.");
        }
        else if(age<18){//if age less than 18.
            System.out.println("Status: Not Eligible");
            System.out.println("Reason: "+name+" is under 18 years.");
            System.out.println(name+" can vote after "+(18-age)+" year(s).");//no. of years left.
        }
        else{//does not have a voterID.
            System.out.println("Status: Not Eligible");
            System.out.println("Reason: Voter ID not available.");
        }
        sc.close();
    }
}