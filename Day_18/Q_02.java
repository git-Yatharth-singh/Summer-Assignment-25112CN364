import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int num,key;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        for( int i=0;i<num;i++){
        System.out.println("ENTER THE ELEMENT:");
        arr[i]=sc.nextInt();
        }
        for(int i =0;i<num-1;i++){
            int min=i;
            for(int j=i+1;j<num;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}