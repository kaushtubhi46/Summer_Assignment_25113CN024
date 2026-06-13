import java.util.Scanner;
public class SymmeticMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of matrix : ");//Enter the number of rows.
        int rows = sc.nextInt();
        System.out.print("Enter columns of matrix : ");//Enter the number of columns.
        int columns = sc.nextInt();
        if(rows!=columns){//the matrix can be checked for symmetry only when it is a square matrix.
            System.out.println("Matrix is not a square matrix.\nTherefore, it cannot be symmetric.");
            sc.close();
            return;//returning without performing other operations.
        }
        else{
            int matrix[][] = new int[rows][columns];//declaring the matrix.
            boolean symmetric = true;//lets assume the given matrix is symmetric.
        System.out.println("Enter the matrix : ");
        //taking the elements of the matrix from the user.
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //checking for symmetry.
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]!=matrix[j][i]){//check whether the element and its mirror element are equal.
                   symmetric = false;//if not equal then update ' symmetric'.
                   break;//exit the inner loop when false.
                }
            }
            if(!symmetric){
               break;//exit the outer loop when false , no need to check further.
            }   
        }  
        //printing the matrix.
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){  
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        } 
        if(symmetric){//printing symmertic if true.
            System.out.println("The matrix is symmetric.");
        }
        else{//when false.
            System.out.println("The matrix is not symmetric.");
        }
        }
        sc.close();
    }
}