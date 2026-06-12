import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of rows : ");//taking number of rows from user.
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");//taking number of columns from user.
        int column = sc.nextInt();
        //declaration
        int arr[][] = new int[row][column];
        System.out.println("Enter the matrix : ");//taking the elements of the matrix from the user.
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //printing transpose matrix.
        System.out.println("Transpose of this matrix is :");
        //transpose of matrix of order column*row.
          for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                //exchanging the elements of rows with columns.
                System.out.print(arr[j][i]+" ");
            }  
            System.out.println();
        }
        sc.close();
    } 
}       