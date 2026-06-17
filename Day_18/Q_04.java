import java.util.*;
public class Q_04{
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
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<num;i++){
        System.out.print(arr[i]+" ");
        }
    }
}