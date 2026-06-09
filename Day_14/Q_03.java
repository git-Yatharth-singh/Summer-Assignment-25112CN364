import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int num,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        for( int i=0;i<num;i++){
        System.out.print("ENTER THE ELEMENT:");
        arr[i]=sc.nextInt();
        }
        for( int i=0;i<num;i++){
            for( int j=0;j<num-i-1;j++){
                if(arr[j]>arr[j+1]){
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
            }
        }
        System.out.println("THE SECOND LARGEST NUMBER IN THE ARRAY: "+arr[num-2]);
    }
}