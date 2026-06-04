import java.util.Scanner;
public class ques2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the binary number : ");
    int binary = sc.nextInt();
     int decimal =0,power = 0;
        while (binary > 0) {
            int digit = binary % 10;
            decimal = decimal + digit * (int)Math.pow(2, power);
            power++;
            binary = binary/10;
        }
        System.out.println("Decimal = " + decimal);
        sc.close();
   }
}