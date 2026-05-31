import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = n, b = n ,sum = 0 ,count = 0;
        while (a!=0){
            count++;
            a=a/10;
        }
        while(b!=0){
           int l = b%10;
            sum =sum + (int)Math.pow(l, count);
            b=b/10;
        }
          if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
