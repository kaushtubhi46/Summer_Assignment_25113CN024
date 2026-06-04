import java.util.Scanner;
public class ques2 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number:");
        int start = sc.nextInt();
        System.out.print("Enter ending number:");
        int end = sc.nextInt();
         System.out.print("All the prime number in the range are = ");
        for(int num=start;num<=end;num++){
            int count=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print( num +" ");
            }
        }
        sc.close();
    }
}