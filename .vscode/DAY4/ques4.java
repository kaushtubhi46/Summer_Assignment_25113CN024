import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        for(int i = start; i<=end;i++){
           int count = 0,sum = 0;
           int a = i, b = i;
           while (a!=0){
            count++;
            a=a/10;
           }
           while(b!=0){
           int l = b%10;
            sum =sum + (int)Math.pow(l, count);
            b=b/10;
           }
           if(sum==i){
            System.out.println(i+" ");
           }
        }
        sc.close();
    }
}