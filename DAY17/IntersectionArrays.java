import java.util.Scanner;
public class IntersectionArrays {
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
        System.out.println("Intersection of arrays is : ");
        for(int i=0;i<size1;i++){
            boolean found = false;//it is used to check whether the element already exists.
            for(int j=0;j<size2;j++){
                if(arr1[i] == arr2[j]){//if same element found in the array then updating 'found'.
                    found = true;
                    break;//used to stop yhe loop and come out of it.
                }
            }
            if(found==true){//if the number is found in second array then the element is printed.
                System.out.print(arr1[i]+" ");
            }
        }
        sc.close();
    }
}