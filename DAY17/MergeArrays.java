import java.util.Scanner;
public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        int size1 = sc.nextInt();//taking the size of the 1st array from user.
        System.out.println("Enter the first array");
        int arr1[] = new int[size1];
        for(int i=0;i<size1;i++){//loop continues till length of array.
            arr1[i] = sc.nextInt();//taking the values of array from user.
        }
        System.out.print("Enter the size of second array : ");
        int size2 = sc.nextInt();//taking the size of the 2nd array from user.
        System.out.println("Enter the second array");
        int arr2[] = new int[size2];
        for(int i=0;i<size2;i++){//loop continues till length of array.
            arr2[i] = sc.nextInt();//taking the values of array from user.
        }
        int merge[] = new int[size1+size2];//creating a new array to store merged elements.
        System.out.println("The merged array is : ");
        for(int i=0;i<size1;i++){
            merge[i]=arr1[i];//copying all elements of first array into merged array.
        }
        for(int i=0;i<size2;i++){
            merge[size1+i] = arr2[i];//copying all elements of second array into merged array after the first array.
        }
        for(int i=0;i<merge.length;i++){//loop tp print the merged array.
            System.out.print(merge[i]+" ");
        }
        sc.close();
    }
}