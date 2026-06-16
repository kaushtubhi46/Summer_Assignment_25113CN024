import java.util.Scanner;
public class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();//taking string input from the user.
        int frequency[] = new int[256];//this array stores frequency of each character.
        for(char ch : str.toCharArray()){//counting frequency of each character.
            frequency[ch]++;
        }
        int maxFrequency = 0;//used to store the highest frequency found so far.
        char maxChar = '\0';//used to store maximum occurring character.
        for(char ch : str.toCharArray()){//finds the highest frequency and max occuring character.
            if(frequency[ch]>maxFrequency){
                maxFrequency = frequency[ch];//updating the maximum frequency and character.
                maxChar = ch;
            }
        }
        System.out.println("Maximum occurring character: "+maxChar);
        System.out.println("Frequency: "+maxFrequency);
        sc.close();
    }   
}