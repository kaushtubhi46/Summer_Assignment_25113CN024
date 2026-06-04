import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n == 1) {
            System.out.println("Nth Fibonacci term = " + a);
        } else if (n == 2) {
            System.out.println("Nth Fibonacci term = " + b);
        } else {
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Nth Fibonacci term = " + b);
        }

        sc.close();
    }
}