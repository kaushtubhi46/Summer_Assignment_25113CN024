import java.util.Scanner;
public class ques37StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            // for printing spaces
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            //for printing stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            // for moving to every next line.
            System.out.println(" ");
        }
        sc.close();
    }
}
// output when n = 5.
//     * 
//    *** 
//   ***** 
//  ******* 
// *********