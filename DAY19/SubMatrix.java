import java.util.Scanner;
public class SubMatrix {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        //for subtraction of two matrices their orders must be same.
        System.out.print("Enter the number of rows : ");//taking number of rows from user.
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");//taking number of columns from user.
        int column = sc.nextInt();
        //declaration
        int arr1[][] = new int[row][column];
        int arr2[][] = new int[row][column];
        int sub[][] = new int[row][column];
        System.out.println("Enter the first matrix : ");//taking the elements of the 1st matrix from the user.
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix : ");//taking the elements of the 2nd matrix from the user.
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr2[i][j] = sc.nextInt();
            }
        } 
        System.out.println("After subtraction of the two matrices : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                //subtracting two matrices.
            sub[i][j] = arr1[i][j] - arr2[i][j];
            //printing their result.
            System.out.print(sub[i][j]+ " ");
            }
            //moving to next row.
            System.out.println();
        }               
        sc.close();
    }
}    