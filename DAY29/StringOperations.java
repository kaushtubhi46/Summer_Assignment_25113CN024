import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char str[] = new char[1000];
        int len = 0;

        //initial string.
        char init[] = {'H','e','l','l','o',' ','W','o','r','l','d'};

        for(int i = 0; i < init.length; i++){
            str[len] = init[i];
            len++;
        }

        int choice = -1;

        while(choice != 0){
            System.out.println("\n========== STRING OPERATIONS ==========");
            System.out.println("1. Length of String");
            System.out.println("2. Uppercase");
            System.out.println("3. Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Check Palindrome");
            System.out.println("6. Concatenate String");
            System.out.println("7. Search Word");
            System.out.println("8. Replace Character");
            System.out.println("9. Count Vowels & Consonants");
            System.out.println("10. Count Words");
            System.out.println("11. Extract Substring");
            System.out.println("12. Compare Strings");
            System.out.println("13. Remove Spaces");
            System.out.println("14. Enter New String");
            System.out.println("0. Exit");

            System.out.print("\nCurrent String : ");
            for(int i = 0; i < len; i++){
                System.out.print(str[i]);
            }

            System.out.print("\nEnter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1://length of string.
                    System.out.println("Length = " + len);
                    break;
                case 2://convert to uppercase.
                    for(int i = 0; i < len; i++){
                        if(str[i] >= 'a' && str[i] <= 'z'){
                            str[i] = (char)(str[i] - 32);
                        }
                    }
                    System.out.print("Uppercase : ");
                    for(int i = 0; i < len; i++){
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 3://convert to lowercase.
                    for(int i = 0; i < len; i++){
                        if(str[i] >= 'A' && str[i] <= 'Z'){
                            str[i] = (char)(str[i] + 32);
                        }
                    }
                    System.out.print("Lowercase : ");
                    for(int i = 0; i < len; i++){
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 4://reverse string.
                    for(int i = 0, j = len - 1; i < j; i++, j--){
                        char temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                    System.out.print("Reversed String : ");
                    for(int i = 0; i < len; i++){
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 5://check palindrome.
                    char lower[] = new char[len];
                    for(int i = 0; i < len; i++){
                        if(str[i] >= 'A' && str[i] <= 'Z'){
                            lower[i] = (char)(str[i] + 32);
                        }else{
                            lower[i] = str[i];
                        }
                    }
                    boolean palindrome = true;
                    for(int i = 0, j = len - 1; i < j; i++, j--){
                        while(i < j && lower[i] == ' '){
                            i++;
                        }
                        while(i < j && lower[j] == ' '){
                            j--;
                        }
                        if(lower[i] != lower[j]){
                            palindrome = false;
                            break;
                        }
                    }
                    if(palindrome){
                        System.out.println("String is a palindrome.");
                    }else{
                        System.out.println("String is not a palindrome.");
                    }
                    break;
                case 6://concatenate string.
                    System.out.print("Enter string to concatenate : ");
                    char input[] = sc.nextLine().toCharArray();
                    if(len > 0 && str[len - 1] != ' ' && len < str.length){//prevent two spaces.
                        str[len] = ' ';
                        len++;
                    }
                    for(int i = 0; i < input.length && len < str.length; i++){
                        str[len] = input[i];
                        len++;
                    }
                    System.out.print("After concatenation : ");
                    for(int i = 0; i < len; i++){
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 7://search word.
                    System.out.print("Enter word to search : ");
                    char word[] = sc.nextLine().toCharArray();
                    boolean found = false;
                    for(int i = 0; i <= len - word.length; i++){
                        int j;
                        for(j = 0; j < word.length; j++){
                            if(str[i + j] != word[j]){
                                break;
                            }
                        }
                        if(j == word.length){
                            System.out.println("Word found at index " + i);
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Word not found.");
                    }
                    break;
                case 8://replace character.
                    System.out.print("Enter character to replace : ");
                    char oldChar = sc.nextLine().charAt(0);
                    System.out.print("Enter new character : ");
                    char newChar = sc.nextLine().charAt(0);
                    int count = 0;
                    for(int i = 0; i < len; i++){
                        if(str[i] == oldChar){
                            str[i] = newChar;
                            count++;
                        }
                    }
                    System.out.println(count + " replacement(s) made.");
                    System.out.print("Updated String : ");
                    for(int i = 0; i < len; i++){
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 9://count vowels and consonants.
                    int vowels = 0;
                    int consonants = 0;
                    for(int i = 0; i < len; i++){
                        char ch = str[i];
                        if(ch >= 'A' && ch <= 'Z'){
                            ch = (char)(ch + 32);
                        }
                        if(ch >= 'a' && ch <= 'z'){
                            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                                vowels++;
                            }else{
                                consonants++;
                            }
                        }
                    }
                    System.out.println("Vowels = " + vowels);
                    System.out.println("Consonants = " + consonants);
                    break;
                case 10://count words.
                    if(len == 0){
                        System.out.println("String is empty.");
                        break;
                    }
                    int wordCount = 0;
                    boolean inWord = false;
                    for(int i = 0; i < len; i++){
                        if(str[i] != ' '){
                            if(!inWord){
                                wordCount++;
                                inWord = true;
                            }
                        }else{
                            inWord = false;
                        }
                    }
                    System.out.println("Word Count = " + wordCount);
                    break;    
                case 11://extract substring.
                    System.out.print("Enter start index : ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index : ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    if(start < 0 || end > len || start > end){
                        System.out.println("Invalid index.");
                    }else{
                        System.out.print("Substring : ");
                        for(int i = start; i < end; i++){
                            System.out.print(str[i]);
                        }
                        System.out.println();
                    }
                    break;
                case 12://compare strings.
                    System.out.print("Enter string to compare : ");
                    char other[] = sc.nextLine().toCharArray();
                    boolean equal = true;
                    if(len != other.length){
                        equal = false;
                    }else{
                        for(int i = 0; i < len; i++){
                            if(str[i] != other[i]){
                                equal = false;
                                break;
                            }
                        }
                    }
                    if(equal){
                        System.out.println("Strings are equal.");
                    }else{
                        System.out.println("Strings are not equal.");
                    }
                    break;
                case 13://remove spaces.
                    char result[] = new char[1000];
                    int newLen = 0;
                    for(int i = 0; i < len; i++){
                        if(str[i] != ' '){
                            result[newLen] = str[i];
                            newLen++;
                        }
                    }
                    len = newLen;
                    for(int i = 0; i < len; i++){
                        str[i] = result[i];
                    }
                    System.out.print("Updated String : ");
                    for(int i = 0; i < len; i++){
                        System.out.print(str[i]);
                    }
                    System.out.println();
                    break;
                case 14://enter new string.
                    System.out.print("Enter new string : ");
                    char newInput[] = sc.nextLine().toCharArray();
                    len = 0;
                    for(int i = 0; i < newInput.length && i < str.length; i++){
                        str[i] = newInput[i];
                        len++;
                    }
                    System.out.println("String updated successfully.");
                    break;
                case 0://exit.
                    System.out.println("Exiting... Thank You!");
                    break;
                default://invalid choice.
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}