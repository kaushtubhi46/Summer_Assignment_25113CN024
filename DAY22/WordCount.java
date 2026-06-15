import java.util.Scanner;
public class WordCount {//if one space is between each word.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");//taking string sentence input from the user.
        String sentence = sc.nextLine();
        int count = 1;//assuming atleast one word is present.
        for(char ch : sentence.toCharArray()){//traversing each character of the sentence.
            if(ch ==' '){
                count++;//update value of count when a space is found.
            }
        }
        System.out.println("Number of words in the sentence are : "+count);//printing the number of words.
        sc.close();
    }
}