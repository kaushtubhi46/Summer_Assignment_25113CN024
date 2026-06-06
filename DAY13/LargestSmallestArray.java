import java.util.Scanner;
    public class LargestSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];//taking the size of the array from user.
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) { //loop continues till size-1. 
            arr[i] = sc.nextInt();
        }
        int largest = arr[0],smallest = arr[0];//initializing the value of largest and smallest with 1st element of array.
        for(int i = 0;i < size;i++){ //loop continues till size-1.
            if(largest < arr[i]){//checking if the value of 'largest' is smaller than arr[i] element.
                largest = arr[i];//updating value of largest in each loop.
            }
            if (arr[i] < smallest) { //checking if the value of 'smallest' is greater than arr[i] element.
                smallest = arr[i];//updating value of smallest in each loop.
            }
        }
        System.out.println("Largest element : "+largest);
         System.out.println("Smallest element : "+smallest);
         sc.close();
    }
}