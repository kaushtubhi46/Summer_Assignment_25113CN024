import java.util.Scanner;
public class SumFunction { 
    static int sum(int a,int b){  // Returns sum of two integers a and b.
    return a+b; // returns the sum of a and b directly as a integer value when called for.
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Sumof the two numbers is : " + sum(a,b)); // calling the sum function .
        sc.close();
    }
}