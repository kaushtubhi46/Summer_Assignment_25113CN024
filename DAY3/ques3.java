import java.util.Scanner;
public class ques3 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        int GCD=1;
         for(int i=1;i<=a && i<=b;i++){
            if(a%i==0&&b%i==0){
                GCD = i;
            }
         }
         System.out.println("The GCD of "+a+" and "+b+" is "+GCD);
        sc.close();
    }
}