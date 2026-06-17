import java.util.Scanner;
public class StringRotation {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the 1st string : ");
     String str1 = sc.nextLine();//take the 1st string from user.
     System.out.print("Enter the 2nd string : ");
     String str2 = sc.nextLine();//take the 2nd string from user.
     if(str1.length()!=str2.length()){//Checking if both strings have the same length.
        System.out.println("Strings are not rotations of each other.");
        sc.close();
        return;//if not the exit the program .
     }   
     if((str1+str1).contains(str2)){//concatinating the first string within itself and checking whetther the 2nd string is present in it.
        System.out.println("Strings are rotations of each other.");//if present then print this.
     }
     else{
        System.out.println("Strings are not rotations of each other.");
     }
     sc.close();
    }
}
//eg str 1 = ABCD
//   str 2 = CDAB
//   str1 + str1 = ABCDABCD
//check if CDAB present (yes)