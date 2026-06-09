import java.util.Scanner;
public class PairWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();//taking the size of the array from user.
        System.out.println("Enter the array elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){//loop continues till length of array.
            arr[i]= sc.nextInt();//taking the values of array from user.
        }
        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();
        boolean found = false;//used to check if the pair is found or not.
        for(int i=0;i<size;i++){//selecting one element at a time.
            for(int j=i+1;j<size;j++){//then checking with remaining elements.
                if(arr[i]+arr[j]==sum){//it executes if pair is found.By adding one element with rest of the elements one by one and checking.
                    System.out.println("Pair found "+arr[i]+" + "+arr[j]);
                    found=true;//updating value of found when pair is found.
                }
            }
        }
        if(found==false){//it executes if no pair is found.
            System.out.println("Pair not found.");
        }
        sc.close();
    }
}