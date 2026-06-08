import java.util.Scanner;
public class ReverseArray {//this function reverse an array using swaping method.
  static void reverse(int arr[],int n){
    //loop continues till half the length of array because each swap places two elements in their correct positions.
    for(int i=0;i<n/2;i++){
      int temp = arr[i];//saving the value temporarily before sawping.
      arr[i]=arr[n-i-1];//now updating the value with the new value from the end.
      arr[n-i-1]=temp;//now placing that stored value in the new position.
    }
    System.out.println("Reverse of the array is :");
    for(int i=0;i<n;i++){//loop continues till length of array.
      System.out.print(arr[i]+" ");//printing the reversed array.
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size : ");
    int size = sc.nextInt();//taking the size of the array from user.
    int arr[] = new int[size]; 
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<size;i++){//loop continues till length of array.
      arr[i]= sc.nextInt();//taking the values of array from user.
    }
    reverse(arr,size);//Calls the function to perform the operation.
    sc.close();
  }
}