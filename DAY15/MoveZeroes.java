import java.util.Scanner;
public class MoveZeroes {
    static void moveZeroes(int arr[]){
        int index = 0;//keeps track of the position for the next non-zero element.
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){//checks if the current element is not equals to zero.
                arr[index]=arr[i]; //if true then update the value of the value at'index' to the value in array.
                index++;//updating the index value after every iteration.
            }
        }
        while (index <arr.length){//this loop fills the remaing postion with zero.
            arr[index] = 0;
            index++;
        }
        System.out.print("Array after moving zeroes to end: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();//taking the size of the array from user.
        System.out.println("Enter the array elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){//loop continues till length of array.
            arr[i]= sc.nextInt();//taking the values of array from user.
        }
        moveZeroes(arr);//calls the function to perform the operation.
        sc.close();
    }
}