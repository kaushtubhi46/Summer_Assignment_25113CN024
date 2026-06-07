import java.util.Scanner;
public class LinearSearch{
  static int linear(int arr[],int a){// this function check for the presence of a given element in the array.
    for(int i = 0;i<arr.length;i++){ //the loop continues till the length of array.
      // checks if the given element to search is equals to any element in array and return the index at which it is present.
      if(arr[i]==a)  return i; 
    }
    return -1;//if element not found return a garbage value (-1) to the main function.
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size]; //taking the size of the array from user.
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){//loop continues till size-1.
          arr[i]= sc.nextInt();//taking the values of array from user.
        }
        System.out.print("Enter element to search : ");
        int num = sc.nextInt();
        int search = linear(arr,num); // stores the return value from the called function.
        // it is used by the main function to check if the real value is found or not.
        if(search==-1){ 
          System.out.println("The number is not present in the given array.");
        }
        else {
           System.out.println("The number is present in the given array at index : "+ search);
        }
        sc.close();
      }
}          