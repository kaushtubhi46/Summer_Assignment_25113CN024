import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int sum = 0;
        while(number != 0){
            int d=number%10;
            sum=sum+d;
            number=number/10;
        }
        System.out.println("Sum of digits of a number = "+ sum);
    }
}