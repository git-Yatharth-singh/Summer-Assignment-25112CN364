import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][columns1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {       
            for (int j = 0; j < columns1; j++) { 
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number of rows: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns2 = sc.nextInt();
        int[][] matrix2 = new int[rows2][columns2];
        if (columns1 != rows2) {
            System.out.println("FOR MUTIPLICATION OF MATRICES THE COLUMNS OF FIRST MATRIX SHOULD BE EQUAL TO THE ROWS OF THE SECOND MATRIX");
            return;
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {       
            for (int j = 0; j < columns2; j++) { 
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix2[i][j] = sc.nextInt();
            }
        }
        int [][] mul=new int [rows1][columns2];
        for(int i =0;i<rows1;i++){
            for(int j=0;j<columns2;j++){
                for(int k=0;k<columns1;k++){
                    mul[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        System.out.println("THE RESULTANT MATRIX IS : \n");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(mul[i][j] + "\t");
            }
            System.out.println();
        }
    }
}