import java.util.Scanner;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();//taking string input from the user.
        int frequency[] = new int[256];//this array stores frequency of each character.
        for(char ch : str.toCharArray()){//counting frequency of each character.
            frequency[ch]++;
        }  
        boolean found = false;//used to check if non repeating character is present.
        for(char ch : str.toCharArray()){
            if(ch!=' '&&frequency[ch] == 1){//if that character has occured only once.
                System.out.println("First non-repeating character: " + ch);
                found = true;//the unique character is found.
                break;//as soon as the 1st character is found exit the loop .
            }
        }
        if(!found){//if no unique character is found.
            System.out.println("No non-repeating character found.");
        }
        sc.close();
    }  
}    