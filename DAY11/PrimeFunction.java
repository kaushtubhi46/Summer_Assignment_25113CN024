import java.util.Scanner;
public class PrimeFunction {
    static void checkPrime(int a){  // Checks if the number is prime or not.
     if(a<=1){
        System.out.println(a + " is not a prime number.");
        return;  // returns no value , just used to jump out of the function and return to original value.
     }
     for(int i=2;i<a;i++){
       if(a%i==0){
         System.out.println(a + " is not a prime number.");
         return;
        }
     }
        System.out.println(a + " is a prime number.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        checkPrime(n); // calls the function to perform the operation.
        sc.close();
    }
}