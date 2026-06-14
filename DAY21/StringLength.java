import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();//taking string input from the user.
        int count = 0;//this variable stores the length of the string.
        for(char ch : str.toCharArray()){//the string is converted into a charcter array and each element is acessed one by one.
            count++;//each time this loop works the value of count is updated by 1.
        }
        System.out.println("Length of the string = "+count);//printing length of string.
        sc.close();
    }
}