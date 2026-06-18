import java.util.Scanner;
public class CommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();//taking 1st string input from the user.
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();//taking 2nd string input from the user.
        int visited[] = new int[256];//used to check for duplicates.
        System.out.print("Common characters: ");
        for(char ch1 : str1.toCharArray()){//traverses each char in str1.
            if(visited[ch1] == 0){//checking if the char was already printed.
                for(char ch2 : str2.toCharArray()){//traverses each char in str2.
                    if(ch1==ch2){//checking if current characters are same or not.
                        System.out.print(ch1+"  ");//printing the common char.
                        visited[ch1] = 1;//marking the char as printed.
                        break;//exiting the inner loop ones the match is found.
                    }
                }
            }
        }
        sc.close();
    }
}