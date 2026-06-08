import java.util.Scanner;
public class LeftRotate {
    static void leftRotate(int arr[],int k){//this function rotates the array to left for k number of times.
        k=k%arr.length;//if k is more tha the actual size of array ,then k is divided by array length .
        if(k<0){//checking if k is negative.
            k=k+arr.length; // updating its value so that the array can be rotated.
        }
        for(int i=0;i<k;i++){//loop continues k times
            int start = arr[0];//storing the number at first index in start.
            for(int j=0;j<arr.length-1;j++){// shifts all elements one position to the left.
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=start; // now storing the 'start' value in the last index.
        }
        System.out.print("Array after rotation : ");//printing the rotated array.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size : ");
    int size = sc.nextInt();
    int arr[] = new int[size]; //taking the size of the array from user.
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<size;i++){//loop continues till length of array.
      arr[i]= sc.nextInt();//taking the values of array from user.
    }
    System.out.print("Enter the number of times to rotate : ");
    int k =sc.nextInt();// the number of times the array is supposed to rotate .
    leftRotate(arr,k);//calling the function to perform the operation.
    sc.close();
    }
}
