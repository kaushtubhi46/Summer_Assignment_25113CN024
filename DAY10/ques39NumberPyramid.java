import java.util.Scanner;
public class ques39NumberPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            // for printing spaces in reverse order
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            //for printing number in left half pyramid
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // for printing number in right half pyramid
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            // for moving to every next line.
            System.out.println(" ");
        }
        sc.close();
    }
}
//output when n = 5
//     1 
//    121 
//   12321 
//  1234321 
// 123454321