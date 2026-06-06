import java.util.Scanner;
public class ArraySumAvg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];//taking the size of the array from user.
        int sum = 0;//initializing the value of sum with 0.
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<size;i++){//loop continues till size-1.
          arr[i]= sc.nextInt();//taking the values of array from user.
          sum = sum + arr[i];//updating value of sum in each loop by adding each element to it.
        }
         System.out.println("Sum of array is : "+sum);
         System.out.println("Average of array is : "+ (double)sum/size);// average of the array in double value.
        sc.close();
  }
}