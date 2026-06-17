import java.util.Scanner;
public class StringCompression {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str = sc.nextLine();//taking string input from the user.
    String compressed = "";//this string stores the new string.
    int count = 1;//it counts the consecutive occurance of a character.
    for(int i=0;i<str.length();i++){//traversing the string char by char.
        while(i<str.length()-1&&str.charAt(i) == str.charAt(i+1)){//this loop counts the consecutive occurance of a character.
            count++;//no.of time that char has occured.
            i++;
        }
        if(count == 1){
            compressed = compressed + str.charAt(i);
        }
        else{
        compressed = compressed + str.charAt(i) + count;//saving the char and its count to the new string.
        }
        count = 1;//then again resetting count for next char.
    }
    System.out.println("Compressed string : "+compressed);//printing the compressed string.
    sc.close();
   } 
}