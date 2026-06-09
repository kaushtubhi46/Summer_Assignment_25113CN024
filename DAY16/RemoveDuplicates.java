import java.util.Scanner;
public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();//taking the size of the array from user.
        System.out.println("Enter the array elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){//loop continues till length of array.
            arr[i]= sc.nextInt();//taking the values of array from user.
        }    
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<size;i++){//selecting one element at a time.
            boolean duplicate = false;//assume current element is not a duplicate.
            for(int j=0;j<i;j++){//checking with previous element.
                if(arr[i]==arr[j]){//if dupilcate found.
                    duplicate = true;//update duplicate value to true.
                    break;//and skip this step don't print that number.
                }
            }
            if(duplicate==false){//if duplicate not found then print the array element.
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}