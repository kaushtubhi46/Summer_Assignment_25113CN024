import java.util.Scanner;
public class FibonacciFunction {
    static void fibonacci(int a){// This function is used to print Fibonacci series up to 'a' terms.
        int n = 0, m = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(n + " ");
            int c = n + m; // addition of first term to second term.
            n = m;  //Swapping of first term to second terms.
            m = c;  //Swapping of second term to new term.
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms :");
        int terms = sc.nextInt();
        fibonacci(terms);//The function is called in the main function here.
        sc.close();
    }
}
