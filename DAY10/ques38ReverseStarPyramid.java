import java.util.Scanner;
public class ques38ReverseStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
       for(int i=n;i>=1;i--){
          //for printing spaces.
          for(int j=1;j<=n-i;j++){
            System.out.print(" ");
          }
          //for printing stars.
          for(int j=2*i-1;j>=1;j--){
            System.out.print("*");
          }
          System.out.println(" ");
        }
        sc.close();
    
    }
} 
// output when n = 5.
// ********* 
//  ******* 
//   ***** 
//    *** 
//     * 