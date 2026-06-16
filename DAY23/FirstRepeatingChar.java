import java.util.Scanner;
public class FirstRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();//taking string input from the user.
        int frequency[] = new int[256];//this array stores frequency of each character.
        for(char ch : str.toCharArray()){//counting frequency of each character.
            frequency[ch]++;
        }  
        boolean found = false;//used to check if a repeating character is present.
        for(char ch : str.toCharArray()){
            if(frequency[ch] > 1){//if that character has occured more than once.
                System.out.println("First repeating character: " + ch);
                found = true;//the repeating character is found.
                break;//as soon as the 1st character is found exit the loop .
            }
        }
        if(!found){//if no repeating character is found.
            System.out.println("No repeating character found.");
        }
        sc.close();
    }    
}