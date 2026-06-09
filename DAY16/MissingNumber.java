import java.util.Scanner;
public class MissingNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter n: ");//Enter the number of terms.
    int n = sc.nextInt();
    int arr[] = new int[n-1];//creates array of size n-1 because one number is missing.
    System.out.println("Enter array elements:");
    for (int i=0;i<n-1;i++){//loop continues till length of array.
       arr[i]=sc.nextInt();
       }
    for (int i=1;i<=n;i++){//checks every number from 1 to n to find the missing number.
       int count=0;//it keeps track of whether the current number is found.
       for (int j=0;j<n-1;j++){//search of the crrent number in the array.
         if(arr[j]==i){//if number found then increasing the value of count by 1.
          count++;
         }
       }
       if(count==0){//if count is still 0,number was not found.
         System.out.println("Missing number is "+i);//print the missing number.
         break;
       }
    }
    sc.close();
  }
}