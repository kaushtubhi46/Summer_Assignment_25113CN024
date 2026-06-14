import java.util.Scanner;
public class VowelConsonantCount {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str = sc.nextLine();//taking string input from the user.
    char arr[] = str.toLowerCase().toCharArray();//converting string into a lowercase character array.
    int vowels = 0,consonants = 0;//variables to count vowels and consonants.
    for( char ch : arr){//accessing each character of the array.
        if(ch>='a'&&ch<='z'){//to check whether the character is an array or not.
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){//check if it is a vowel.
               vowels++;//incrementing vowels count.
            }
            else{
               consonants++;//incrementing consonant count.
            }
        }
    }
    System.out.println("Number of vowels : "+ vowels);//printing the number of vowels.
    System.out.println("number of consonents : "+consonants);//printing the number of consonants.
    sc.close();
    }
}