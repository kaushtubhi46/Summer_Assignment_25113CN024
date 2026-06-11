import java.util.Scanner;
public class DescendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();//taking the size of the array from user.
        System.out.println("Enter the array elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){//loop continues till length of array.
            arr[i]= sc.nextInt();//taking the values of array from user.
        }
        //BubbleSort
        for(int i=0;i<size-1;i++){//loop decide number of iterations taking place.
            boolean swapped = false;//this swap is used to check if swapping acctually occurs.
            for(int j=0;j<size-i-1;j++){//compares adjacent elements.
                //swapping if element in wrong place.
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;//when swapping occurs.
                }
            }
            if(!swapped){//if no swapping.Array is already sorted.
                break;//come out of loop early.
            }
        }
    for(int i=0;i<size/2;i++){
      int temp = arr[i];//saving the value temporarily before sawpping.
      arr[i]=arr[size-i-1];//now updating the value with the new value from the end.
      arr[size-i-1]=temp;//now placing that stored value in the new position.
    }
    System.out.println("Array in descending order : ");
    for(int num : arr){//printing the array in descending order.
        System.out.print(num+" ");
     }
     sc.close();
    }
}