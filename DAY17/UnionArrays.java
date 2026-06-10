import java.util.Scanner;
public class UnionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        int size1 = sc.nextInt();//taking the size of the 1st array from user.
        System.out.println("Enter the first array");
        int arr1[] = new int[size1];
        for(int i=0;i<size1;i++){//loop continues till length first of array.
            arr1[i] = sc.nextInt();//taking the values of array from user.
        }
        System.out.print("Enter the size of second array : ");
        int size2 = sc.nextInt();//taking the size of the 2nd array from user.
        System.out.println("Enter the second array");
        int arr2[] = new int[size2];
        for(int i=0;i<size2;i++){//loop continues till length of  second array.
            arr2[i] = sc.nextInt();//taking the values of array from user.
        }
        int union[] = new int[size1+size2];//creating a new array to store union of elements.
        int k = 0;//keeps track of the number of unique elements in union array.
        System.out.println("The union of array is : ");    
        for(int i=0;i<size1;i++){
            union[k]=arr1[i];//copying elements of first array into union array.
            k++; // updating the value of k for each entry in union.
        }
        for(int i=0;i<size2;i++){
            boolean found = false;//it is used to check whether the element already exists.
            for(int j=0;j<k;j++){
                if(arr2[i]==union[j]){//checking if that element of second array array is already present in union array.
                    found = true;
                    break;//if true the continue to next step skipping the current number.
                }
            }
            if(!found){
                union[k]=arr2[i];//adding element to union array if it is unique.
                k++;//again updating the value of k for each entry in union.
            }
        }
        for(int i=0;i<k;i++){//printing all unique elements stored in union array.
            System.out.print(union[i]+" ");
        }
        sc.close();
    }
}