import java.util.Scanner;
public class PalindromeString {//two pointer method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();//taking string input from the user.
        int start = 0;//pointing to the first character.
        int end = str.length()-1;//pointing to the last character.
        boolean palindrome = true;//used to check if the string is palindrome.
        while(start<end){//comparing the characters form start to end.
            if(str.charAt(start) != str.charAt(end)){
                palindrome = false;//if characters don't match.
                break;//come out of loop.
            }
            start++;//if true then change position of start to next place.
            end--;//if true then change position of end to next place.
        }
        if(palindrome){//if palindrome then print this.
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}