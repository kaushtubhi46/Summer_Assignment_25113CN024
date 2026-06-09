import java.util.Scanner;
public class MaximumFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();//taking the size of the array from user.
        System.out.println("Enter the array elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){//loop continues till length of array.
            arr[i]= sc.nextInt();//taking the values of array from user.
        }
        int maxfreq = 0,maxnum = arr[0];//initializing maximum frequency with 0 and maximum number with first element of array.
        for(int i=0;i<size;i++){//this loop selects one element at a time.
            int count = 0;//used to count the frquency of the current element.
            for(int j=0;j<size;j++){//compares current element with all the elements.
                if(arr[i]==arr[j]){//if same number found then the value of count is incerased by 1.
                    count++;
                }
            }
            if(count>maxfreq){//if current frequency is greater than maximum frequency.
                maxfreq = count;//if true then updating the value of maxfreq with count.
                maxnum = arr[i];//updating the value of maxnum with the current array element.
            }
        }
        System.out.println("Element with maximum frequency: " + maxnum);
        System.out.println("Frequency: " + maxfreq);        
        sc.close();    
    }
}