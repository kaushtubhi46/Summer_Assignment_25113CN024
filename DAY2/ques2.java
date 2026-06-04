import java.util.Scanner;
public class ques2 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int reverse = 0;
        while(number !=0){
            int d= number%10;
            reverse = reverse*10 + d;
            number=number/10;
        }
        System.out.println("Reverse of a number is = "+ reverse);
        sc.close();
    } 
}