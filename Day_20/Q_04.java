import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {       
            for (int j = 0; j < columns; j++) { 
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<columns;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                sum+=matrix[j][i];
            }
        System.out.println("Sum of Column " + i + ": "+sum);      
        }
    }
}
