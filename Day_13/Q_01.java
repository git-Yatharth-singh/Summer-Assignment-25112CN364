import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        for( int i=0;i<num;i++){
        System.out.println("ENTER THE ELEMENT:");
        arr[i]=sc.nextInt();
        }
        System.out.println("THE ARRAY:");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}