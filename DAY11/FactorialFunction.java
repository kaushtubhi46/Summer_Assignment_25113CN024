import java.util.Scanner;

public class FactorialFunction {  // Returns factorial of integer 'a' using loop.
    static int factorial(int a){
        int fact = 1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        return fact; // returns fact as the integer value when called for.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Factorial of the number is "+ factorial(n));  // calls the function to perform the operation and return the value.
        sc.close();
    }
}