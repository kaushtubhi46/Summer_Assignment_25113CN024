import java.util.Scanner;
public class ReverseString {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str = sc.nextLine();//taking string input from the user.
    char arr[] = str.toCharArray();//converting string into character array.
    System.out.print("Reverse of the string is : ");
    for(int i=arr.length-1;i>=0;i--){//moving through the array in reverse order.
        System.out.print(arr[i]);//printing each character in reverse order.
    }
    sc.close();
   } 
}
