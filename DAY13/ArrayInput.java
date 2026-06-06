import java.util.Scanner;
public class ArrayInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size]; //taking the size of the array from user.
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<size;i++){//loop continues till size-1.
          arr[i]= sc.nextInt();//taking the values of array from user.
        }
         System.out.print("Array elements are : ");
        for(int i=0;i<size;i++){//loop continues till size-1.
            System.out.print(arr[i]+" ");//printing all the values of array using loops.
        }
        sc.close();
    }
}