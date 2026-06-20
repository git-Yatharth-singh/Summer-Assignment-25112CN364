import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        boolean sym=false;
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        if(rows!=columns){
            System.out.println("FOR A MATRIX TO BE SYMMETRIC ROWS AND COLUMNS SHOULD BE EQUAL");
            return;
        }
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {       
            for (int j = 0; j < columns; j++) { 
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    sym=false;
                    break;
                }
            }
            if (!sym) {
                break; 
            }
        }
        if(sym){
            System.out.println("THE MATRIX IS SYMMETRIC");
        }
        else{
            System.out.println("THE MATRIX IS NOT SYMMETRIC");
        }
    }
}