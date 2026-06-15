import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str = sc.nextLine();//taking string input from the user.
        int frequency[] = new int[300];//this array store frequency of each character.
        for(char ch : str.toCharArray()){//counting frequency of each character.
            frequency[ch]++;
        }
        for(char ch : str.toCharArray()){//printing frequency of unique characters
            if(frequency[ch]!=0){
                System.out.println("Frequency of "+ch+" is "+frequency[ch]);
                frequency[ch] = 0;//to tell that the character is already printed.
            }
        }
        sc.close(); 
    }
}