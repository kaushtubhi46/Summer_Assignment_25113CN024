import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();//taking string input from the user.
        String withoutspace = "";//creating a new string to store characters without spaces.
        for(char ch : str.toCharArray()){
            if(ch != ' '){
                //adding only non-space characters to the new string
                withoutspace += ch;
            }
        }
        System.out.println("String after removing spaces : " + withoutspace);//printing the new string without spaces.
        sc.close();
    }    
}