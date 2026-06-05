import java.util.Scanner;
public class PalindromeFunction { // Checks if the number is palindrome or not.
    static void palindrome(int a){
        int n = a, rev =0;
        while(n!=0){
            int d=n%10;//take the last digit of the number
            rev =rev*10+d;//add it to rev to make the new number
            n=n/10;//update the original number used
        }
        if(rev==a){// Checks if the new number is equals to the original number
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        palindrome(number);// Calls the function to perform the operation.
        sc.close();
    }
}