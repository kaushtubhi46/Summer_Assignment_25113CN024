import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String str = sc.nextLine(); //taking a sentence as input.
        String currentWord = "";
        String longestWord = "";
        for(int i=0;i<str.length();i++){//traversing the string character by character.
            if(str.charAt(i) != ' '){
                //reading the current word and storing it in the string char by char.
                currentWord = currentWord + str.charAt(i);
            }
            else{
                if(currentWord.length() > longestWord.length()){//checking if the current word is the longest.
                    longestWord = currentWord;//if true the saving it in the 'longestword' string.
                }
                currentWord = "";//resetting 'currentword' string so that it can store the next word.
            }
        }
        // Checking the last word.
        if(currentWord.length() > longestWord.length()){//checking if the current word is the longest.
            longestWord = currentWord;//if true the saving it in the 'longestword' string.
        }
        System.out.println("Longest word : "+longestWord);
        System.out.println("Length : "+longestWord.length());
        sc.close();
    }
}