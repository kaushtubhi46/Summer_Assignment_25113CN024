import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        int size1 = sc.nextInt();//taking the size of the 1st array from user.
        System.out.println("Enter the first array");
        int arr1[] = new int[size1];
        for(int i=0;i<size1;i++){//loop continues till length first of array.
            arr1[i] = sc.nextInt();//taking the values of array from user.
        }
        System.out.print("Enter the size of second array : ");
        int size2 = sc.nextInt();//taking the size of the 2nd array from user.
        System.out.println("Enter the second array");
        int arr2[] = new int[size2];
        for(int i=0;i<size2;i++){//loop continues till length of  second array.
            arr2[i] = sc.nextInt();//taking the values of array from user.
        }
        System.out.println("Common elements of the two arrays are : ");
        //running two loop for comparing the two arrays.
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(arr1[i] == arr2[j]){//if same element is present in the 2nd array then print it.
                 System.out.print(arr1[i]+" ");
                 break;//used tto come out of loop.
                }
            }
        }
        sc.close();
    }
}