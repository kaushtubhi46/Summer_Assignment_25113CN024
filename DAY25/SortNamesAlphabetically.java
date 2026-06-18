import java.util.Scanner;
public class SortNamesAlphabetically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names : ");
        int num = sc.nextInt();//take the number of names.
        sc.nextLine();//consume leftover newline
        System.out.println("Enter the names : ");
        String names[] = new String[num];//it will store all the names from the user.
        for(int i =0;i<num;i++){//loop to take all the names as input from user.
            names[i] = sc.nextLine();
        }
        //bubble sort.
        for(int i=0;i<num-1;i++){//loop decides number of iterations taking place.
            boolean swapped = false;//this swap is used to check if swapping acctually occurs.
            for(int j=0;j<num-i-1;j++){//compares adjacent elements.
                //swapping if element in wrong place.
                if(names[j].compareTo(names[j+1])>0){//compare adjacent names alphabetically.
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                    swapped = true;//when swapping occurs.
                }
            }
            if(!swapped){//if no swapping.String array is already sorted.
                break;//come out of loop early.
            }
        }
        System.out.println("Names in alphabetical order : ");
        for(String name : names){
            System.out.println(name);//print the names.
        }
        sc.close();
    }
}