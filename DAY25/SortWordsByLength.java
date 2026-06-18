import java.util.Scanner;
public class SortWordsByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words : ");
        int num = sc.nextInt();//take the number of words.
        sc.nextLine();//consume leftover newline
        System.out.println("Enter the words : ");
        String words[] = new String[num];//it will store all the words from the user.
        for(int i =0;i<num;i++){//loop to take all the words as input from user.
            words[i] = sc.nextLine();
        }
        //bubble sort.
        for(int i=0;i<num-1;i++){//loop decides number of iterations taking place.
            boolean swapped = false;//this swap is used to check if swapping acctually occurs.
            for(int j=0;j<num-i-1;j++){//compares adjacent elements.
                //swapping if element in wrong place.
                if(words[j].length()>(words[j+1].length())){//compare adjacent words by length.
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                    swapped = true;//when swapping occurs.
                }
            }
            if(!swapped){//if no swapping.String array is already sorted.
                break;//come out of loop early.
            }
        }
        System.out.println("Words sorted by length : ");
        for(String word : words){
            System.out.println(word);//print the words.
        }
        sc.close();
    }
}