import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int num,sum=0,avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int [num];
        System.out.println("ENTER THE ELEMENTS:");
        for( int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for( int i=0;i<num;i++){
        sum+=arr[i];
        }
        System.out.println("THE SUM OF THE ARRAY IS: "+sum);
        avg=(sum/num);
        System.out.println("THE AVERAGE OF THE ARRAY IS: "+avg);
    }
}