import java.util.Scanner;
public class ques2 {
    static int Fibonacci(int a){
        if(a==1||a==0){
            return a;
        }
        else{
            return Fibonacci(a - 1) + Fibonacci(a - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println( "Fibonacci term is : "+ Fibonacci(n));
        sc.close();
    }
}