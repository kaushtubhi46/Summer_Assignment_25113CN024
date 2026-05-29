import java.util.Scanner;
public class ques4 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = sc.nextInt();
        int original = number;
        int reverse = 0;
        while(number !=0){
            int d= number%10;
            reverse = reverse*10 + d;
            number=number/10;
        }
        if (reverse==original) {
           System.out.println(" The number is palindrom. "); 
        } 
        else {
            System.out.println("The number is not a palindrom.");
        }
    } 
}