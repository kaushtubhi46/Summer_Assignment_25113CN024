import java.util.Scanner;
public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String word1 = sc.nextLine();//take the 1st string from user.
        System.out.print("Enter the second string : ");
        String word2 = sc.nextLine();//take the 2nd string from user.
        if(word1.length()!=word2.length()){//first check if their lengths are equal or not.
            System.out.println("Strings are not anagrams.");
            sc.close();
            return;//exit the program if lengths are different.
        }
        int frequency[] = new int[256];//this array stores frequency of each character.
        for(char ch : word1.toCharArray()){//counting frequency of each character in 1st string.
            frequency[ch]++;
        }
        for(char ch : word2.toCharArray()){//decrease the frequency of each character in 2nd string.
            frequency[ch]--;
        }
        boolean isAnagram = true;//lets assume they are anagram.
        for(int count : frequency){//checking if all frequencies have become zero.
            if(count!=0){
                isAnagram = false;//if not that means that diffrent characters are present or missing hence not anagrams.
                break;//as soon as mismatch found, exit the loop.
            }
        }
        if(isAnagram){//if the strings are anagrams.
            System.out.println("Strings are anagrams.");
        }else{
            System.out.println("Strings are not anagrams.");
        }
        sc.close();
    }    
}