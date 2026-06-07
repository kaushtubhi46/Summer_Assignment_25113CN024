import java.util.Scanner;
public class DuplicateElements {
  static void findDuplicate(int arr[]){//this function is used to find duplicate numbers in the array.
    for(int i=0;i<arr.length;i++){//loop continues till length of array. Select one element at a time.
      for(int j=i+1;j<arr.length;j++){// Compare the current element with the remaining elements.
        if(arr[i]==arr[j]){// checks for duplicate numbers.
          System.out.println(arr[i]);
          break;// it stops checking further once a duplicate is found for the current element.
        }
      }
    }
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
        System.out.println("Duplicate elements are : ");
        findDuplicate(arr);//calling the function to perform the operations.
        sc.close();
     }
}