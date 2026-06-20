import java.util.*;
public class Q_02{
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
        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("FOR SUBSTRACTION OF MATRICES THE DIMENSIONS OF THE MATRICES SHOULD BE IDENTICAL");
            return;
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {       
            for (int j = 0; j < columns2; j++) { 
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        int [][] sumMatrix=new int[rows1][rows2];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns1;j++){
                sumMatrix[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        System.out.println("\nResulting Sum Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}