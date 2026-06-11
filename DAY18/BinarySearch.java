import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();//taking the size of the array from user.
        System.out.println("Enter the sorted array in ascending order : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){//loop continues till length of array.
            arr[i]= sc.nextInt();//taking the values of array from user.
        }
        System.out.print("Enter the element to search : ");
        int n = sc.nextInt();
        int start = 0,end = size-1,found = -1;//used to check if the number is present or not and store the index value.
        while(start<=end){//continue searching while a valid range exists.
              int mid = (start+end)/2;//find the middle index.
              if(arr[mid]==n){//the element is found.
                found = mid;
                break;//stop the loop.
              }
              if(arr[mid]<n){//search in the right half of the array.
                start = mid+1;//move start to next position after mid.
              }
              else{//search in the left half of the array.
                end = mid-1;//move end to next position before mid.
              }
        }
        if(found != -1){//if number is present then print this.
            System.out.println("The number is found at index : "+found);
        }
        else{
            System.out.println("Number not found");//element is not present in the array.
        }
        sc.close();
    }    
}