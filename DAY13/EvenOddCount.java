import java.util.Scanner;
    public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];//taking the size of the array from user.
        int odd = 0,even = 0; //initializing the value of odd and even with 0.
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) { //loop continues till size-1. 
            arr[i] = sc.nextInt(); //taking the values of array from user.
            if(arr[i]%2==0){ // checking if the array element is odd or even .
                even++;//if the element is even then the value of 'even' increase by 1.
            }
            else{
                odd++;//if the element is odd then the value of 'odd' increase by 1.
            }
        }
         System.out.println("Number of even elements: " + even);
         System.out.println("Number of odd elements: " + odd);
        sc.close();
    }
}