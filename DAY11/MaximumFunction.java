import java.util.Scanner;

public class MaximumFunction {
    static int maximum(int a, int b){  // Returns larger of two integers a and b.
        if(a>b){
            return a; // returns a as the integer value when called for.
        }
        else{
            return b; // returns b as the integer value when called for.
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Maximum of the two numbers is : "+ maximum(a,b)); // calls the function to perform the operation and return the value.
        sc.close();
    }
}