import java.util.Scanner;
public class ques40CharPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
          // for printing spaces in reverse order
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            //for printing character in left half pyramid
           for(char ch = 'A';ch<'A'+i;ch++){
            System.out.print(ch);
           }
           //for printing character in right half pyramid
           for(char ch = (char)('A'+i-2);ch>='A';ch--){
            System.out.print(ch);
           }
           System.out.println(" ");
        }
        sc.close();
    }        
}
// output when n = 5
//     A 
//    ABA 
//   ABCBA 
//  ABCDCBA 
// ABCDEDCBA 
