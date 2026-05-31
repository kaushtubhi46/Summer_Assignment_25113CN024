import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a = n,sum = 0;
        while(a!=0){
            int d = a%10;
            int fact =1;
            for(int i=1;i<=d;i++){
                fact = fact *i;
            }
            sum = sum + fact;
            a=a/10;
        }
         if (sum == n) {
            System.out.println(n + " is a Strong Number.");
        } else {
            System.out.println(n + " is not a Strong Number.");
        }
        sc.close();
    }
}