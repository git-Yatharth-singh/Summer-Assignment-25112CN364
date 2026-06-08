import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int num,sum=0,avg=0,max,min,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int [num];
        System.out.println("ENTER THE ELEMENTS:");
        for( int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        min=arr[0];
        for(int i=0;i<num;i++){
            if(max<arr[i]){
            temp=max;
            max=arr[i];
            arr[i]=max;
            }
        }
        for(int i=0;i<num;i++){
            if(min>arr[i]){
            temp=min;
            min=arr[i];
            arr[i]=min;
            }
        }
        System.out.println("THE LARGEST NUMBER IN THE ARRAY IS: "+max);
        System.out.println("THE SMALLEST NUMBER IN THE ARRAY IS: "+min);
    }
}