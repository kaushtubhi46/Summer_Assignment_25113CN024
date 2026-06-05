import java.util.Scanner;
public class ArmstrongFunction {  //Checks if the number if the Armstrong number or not.
    static void armstrong(int a){
        int n = a,m = a,count = 0,sum = 0;
        // Loop used to count number of digits.
        while(n!=0){
            count++;
            n=n/10;
        }
        // Loop used to find the sum of digits raised to count.
        while(m!=0){
            int digit = m%10;
            sum = sum + (int)Math.pow(digit, count);
            m=m/10;
        }
        if(sum==a){ //Checks if the sum is equals to the original number.
            System.out.println("The number is an Armstrong number.");
        }
        else{
            System.out.println("The number is not an Armstrong number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        armstrong(number); //Calls the function to perform the operation.
        sc.close();
    }
}