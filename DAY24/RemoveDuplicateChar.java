import java.util.Scanner;
public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();//taking string input from the user.
        int visited[] = new int[256];//checks if the character has occured previously or not.
        String result = "";//stores the new string without duplicates.
        for( char ch : str.toCharArray()){//traversing the string character by character.
            if(visited[ch] == 0){//used to check if the char has appeard for the 1st time.
                result = result + ch;//if true then adding it to the new 'result' string.
                visited[ch] = 1;//marking the character as visited so it is not added again.
            }
        }
        System.out.println("String after removing duplicates : " + result);//printing the string without duplicates.
        sc.close();
    }
}