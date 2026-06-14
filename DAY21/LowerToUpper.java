import java.util.Scanner;
public class LowerToUpper {//using ASCII based approach.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();//taking string input from the user.
        char arr[] = str.toCharArray();//converting string into character array.
        for(int i=0;i<arr.length;i++){//accessing eeach character of the array.
            if(arr[i]>='a'&&arr[i]<='z'){//checking if the character is lowercase.
                arr[i] = (char)(arr[i]-32);//converting lowercase into uppercase.
            }
        }
        System.out.print("String in uppercase : ");
        for(char ch : arr){//printing the converted string.
            System.out.print(ch);
        }
        sc.close();
    }
}