import java.util.Scanner;
public class ques3 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int product = 1;
        while(number !=0){
            int d= number%10;
            product = product*d;
            number=number/10;
        }
        System.out.println("Product of a number is = "+ product);
        sc.close();
    } 
}