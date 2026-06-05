import java.util.Scanner;
public class PerfectNumberFunction {
    static void perfectnumber(int a){//The function checks for perfect number. 
        int sum = 0;
        for(int i=1;i<a;i++){ // The loop continues till the value of n-1.
            if(a%i==0){// Checks if the number exactly divisible. 
                sum = sum + i; //Value of sum is updated by adding the divisor.
            }
        }
        if(sum==a){// Checking if the sum is exactly equal to the original value.
            System.out.println("The number is a Perfect Number.");
        }
        else{
            System.out.println("The number is not a Perfect Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        perfectnumber(number);// The function is called within the main function.
        sc.close();
    }
}
