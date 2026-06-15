import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int num,num2,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF FIRST ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        for( int i=0;i<num;i++){
        System.out.println("ENTER THE ELEMENTs:");
        arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE LENGTH OF SECOND ARRAY:");
        num2=sc.nextInt();
        int []arr2=new int[num2];
        for( int i=0;i<num2;i++){
        System.out.println("ENTER THE ELEMENTs:");
        arr2[i]=sc.nextInt();
        }
        int [] arr3=new int[num+num2];
        for(int i=0;i<num;i++){
            arr3[i]=arr[i];
        }
        for(int i =num;i<(num+num2);i++){
            arr3[i]=arr2[c];
            c++;
        }
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}