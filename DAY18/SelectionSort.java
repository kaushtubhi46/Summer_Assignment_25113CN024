import java.util.Scanner;
public class SelectionSort {//in this method we search for the smallest term and place it in the first place.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();//taking the size of the array from user.
        System.out.println("Enter the array elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){//loop continues till length of array.
            arr[i]= sc.nextInt();//taking the values of array from user.
        }   
        //SelectionSort
        for(int i=0;i<size-1;i++){
            int minIndex = i;//lets assume that the current element is the minterm.
            for(int j=i+1;j<size;j++){//search for the smallest element unsorted array.
                if(arr[minIndex]>arr[j]){
                    minIndex=j;//updating the index of the smallest term.
                }
            }
            //swapping of number at minindex with the smallest number.
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted array is : ");
            for(int num : arr){//printing the sorted array.
                System.out.print(num+" ");
            }
        sc.close(); 
    }
}