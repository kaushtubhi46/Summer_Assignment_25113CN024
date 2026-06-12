import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of rows : ");//taking number of rows from user.
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");//taking number of columns from user.
        int column = sc.nextInt();
        //declaration
        int arr[][] = new int[row][column];
        int sum = 0;//initiating the value of sum variable.
        System.out.println("Enter the matrix : ");//taking the elements of the matrix from the user.
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        if(row!=column){//checking if the given matrix is square matrix or not.
            System.out.println("We cannot find the diagonal sum because the matrix is not square.");
        }
        else{//printing the sum.
            System.out.println("Sum of diagonal elements is :");
            for(int i=0;i<row;i++){
                    sum = sum + arr[i][i];
                }
            System.out.print(sum);
        }
        sc.close();
    }
}