import java.util.Scanner;
public class RowSum {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of rows : ");//taking number of rows from user.
        int row = sc.nextInt();
        System.out.print("Enter the number of columns : ");//taking number of columns from user.
        int column = sc.nextInt();
        //declaration
        int matrix[][] = new int[row][column];
        System.out.println("Enter the matrix : ");//taking the elements of the matrix from the user.
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            int sum = 0;//intialising the value of sum to 0 for every row.
            for(int j=0;j<column;j++){
                sum += matrix[i][j];//add every row element.
            }
            //printing every row's sum.
            System.out.println("The sum of row "+(1+i)+" is : "+ sum);
        }
        sc.close();
    }
}        