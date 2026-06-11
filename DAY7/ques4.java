import java.util.Scanner;
public class ques4 {
    static int rev = 0;//static method cannot directly access non-static variables. Therefore rev is made static as well.
    static void Reverse(int a) {
        if (a > 0) {
            rev = rev * 10 + a % 10;
            Reverse(a / 10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Reverse(n);
        System.out.println("Reverse of the number = " + rev);
        sc.close();
    }
}