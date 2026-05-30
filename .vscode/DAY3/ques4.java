import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        
        int lcm = a * b;
        for (int i = 1; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
            }
        }

        System.out.println("LCM = " + lcm);
        sc.close();
    }
}