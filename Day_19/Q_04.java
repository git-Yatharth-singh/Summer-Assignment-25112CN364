import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int prim=0,sec=0,total;
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        if(rows!=columns){
            System.out.println("FOR FINDING THE SUM OF DIAGONALS THE ROWS AND COLUMNS OF THE MATRIX SHOULD BE EQUAL");
            return;
        }
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {       
            for (int j = 0; j < columns; j++) { 
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==j){
                    prim+=matrix[i][j];
                }
            }
        }
        System.out.println("PRIMARY DIAGONAL SUM: "+prim);
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(j==(columns-1)-i){
                    sec+=matrix[i][j];
                }
            }
        }
        System.out.println("SECONDARY DIAGONAL SUM: "+sec);
        total=prim+sec;
        if(rows%2!=0){
            total-=matrix[rows/2][columns/2];
        }
        System.out.println("TOTAL DIAGONAL SUM: "+total);
    }
}