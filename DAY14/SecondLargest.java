import java.util.Scanner;
public class SecondLargest {// assuming this array has atleast two distinct elements.
  static int secondlargest(int arr[]){// this function is used to find the second largest element in the array.
    //initialising the value of largest and secondlarge with the first element of the array.
    int largest = arr[0];
    int secondlarge = arr[0];
    for(int i=0;i<arr.length;i++){//loop continues till length of array.
      if(arr[i]>largest){// checking if the array element is larger than the current value of 'largest'.
        largest = arr[i];//if true then updating the value of largest with the new value .
      }
    }
    for(int i=0;i<arr.length;i++){//loop continues till length of array.
      // Check if the current element is greater than secondlarge and not equal to largest.
      if(arr[i]>secondlarge&&arr[i]!=largest){ 
        secondlarge = arr[i];//if true then updating the value of secondlarge with the new value .
      }
    }
     return secondlarge; //returning the updated value of secondlarge to the main function.
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size]; //taking the size of the array from user.
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){//loop continues till length of array.
          arr[i]= sc.nextInt();//taking the values of array from user.
        }
        int result = secondlargest(arr);//calling the function and storing the value in result.
        System.out.println("The second largest element in the array is : "+ result);
        sc.close();
    }
}