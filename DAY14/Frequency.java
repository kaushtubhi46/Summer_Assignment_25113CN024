import java.util.Scanner;
public class Frequency{
    static int frequency(int arr[],int a){//This function is used to find the frequency of any given number.
        int count = 0;
        for(int i=0;i<arr.length;i++){//loop continues till length of array.
            if(arr[i]==a) { // checking if the value in array is equals to the given value.
                count++; // updating value of count when that number is found in the array.
            }
        }
        return count ; // returning the updated value of count to the main function.
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size]; //taking the size of the array from user.
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<size;i++){//loop continues till length of array.
          arr[i]= sc.nextInt();//taking the values of array from user.
        }
        System.out.println("Enter the element : ");
        int num = sc.nextInt();//taking the element from user whoes frequency is to be found.
        int freq = frequency(arr,num);// calling the function and storing the value in freq.
        System.out.println("Frequency of the given element is : "+ freq);
        sc.close();
    }
}