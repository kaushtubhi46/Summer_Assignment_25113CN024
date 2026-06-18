import java.util.Scanner;
public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 1st sorted array : ");
        int size1 = sc.nextInt();//taking the size of the 1st array from user.
        System.out.print("Enter the 1st sorted array : ");
        int arr1[] = new int[size1];
        for(int i=0;i<size1;i++){//loop continues till length of array.
            arr1[i] = sc.nextInt();//taking the values of array from user.
        }
        System.out.print("Enter the size of the 2nd sorted array : ");
        int size2 = sc.nextInt();//taking the size of the 2nd array from user.
        System.out.print("Enter the 2nd sorted array : ");
        int arr2[] = new int[size2];
        for(int i=0;i<size2;i++){//loop continues till length of array.
            arr2[i] = sc.nextInt();//taking the values of array from user.
        }
        int merge[] = new int[size1+size2];//it will store the merged sorted array.
        int i = 0,j = 0,k = 0;//i traverses arr1,j traverses arr2,k traverses merge.
        while(i<size1&&j<size2){//continue until one of the arrays is completely traversed.
            if(arr1[i]>=arr2[j]){//comparing current elements of both arrays
                merge[k] = arr2[j];//and storing the smaller one in merge array.
                j++; //moving to next element of arr2.
            }
            else{
                merge[k] = arr1[i];
                i++;//moving to next element of arr1.
            }
            k++;//moving to next place in merge array. 
        }
        //after the above loop, one array may still have remaining elements.
        while(i<size1){//copy remaining elements of arr1, if any.
            merge[k] = arr1[i];//are saved as it is in merge array.
            i++;//moving to next element of arr1.
            k++;//moving to next place in merge array. 
        }
        while(j<size2){//copy remaining elements of arr2, if any.
            merge[k] = arr2[j];//are saved as it is in merge array.
            j++;//moving to next element of arr2.
            k++;//moving to next place in merge array. 
        }
        System.out.println("Merged sorted array : ");
        for(int num : merge){
            System.out.print(num+" ");//printing the merged array.
        }
        sc.close();
    }
}