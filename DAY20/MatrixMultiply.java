import java.util.Scanner;
public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of 1st matrix : ");
        int row1 = sc.nextInt();
        System.out.print("Enter columns of 1st matrix : ");
        int column1 = sc.nextInt();
        System.out.print("Enter rows of 2nd matrix : ");
        int row2 = sc.nextInt();
        System.out.print("Enter columns of 2nd matrix : ");
        int column2 = sc.nextInt();
        if(column1!=row2){//checking whether matrix multiplication is possible.
            System.out.println("Matrix multiplication is not possible.");
        }
        else{
            //declaration of matrices.
            int arr1[][] = new int[row1][column1];// matrix 1
            int arr2[][] = new int[row2][column2];//matrix 2
            int product[][] = new int[row1][column2];//new product matrix.
            //taking elements of first matrix.
            System.out.println("Enter the first matrix : ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<column1;j++){
                    arr1[i][j] = sc.nextInt();
                }
            }
            //taking elements of second matrix.
            System.out.println("Enter the second matrix : ");
            for(int i=0;i<row2;i++){
                for(int j=0;j<column2;j++){
                    arr2[i][j] = sc.nextInt();
                }
            }
            //finding product of the two matrices.
            System.out.println("Product of the two matrices : ");
            for(int i=0;i<row1;i++){//
                for(int j=0;j<column2;j++){
                    for(int k=0;k<column1;k++){
                        product[i][j] = product[i][j] + arr1[i][k]*arr2[k][j];
                    }
                }
            }
            //printing the product matrix.
            for(int i=0;i<row1;i++){
                for(int j=0;j<column2;j++){
                    System.out.print(product[i][j]+" ");
                }
                //moving to next row.
                System.out.println();
            }
        }
        sc.close();
    }
}