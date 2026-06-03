import java.util.Scanner;
public class ques3 {
    static int sum(int a){
        if(a==0){
            return a;
        }
        else {
            int d = a%10;
            int rem = a/10;
            int result = d + sum(rem);
            return(result);
        }
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits = " + sum(n));
        sc.close();
    }  
}