import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        for( int i=0;i<num;i++){
        System.out.println("ENTER THE ELEMENTs:");
        arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE NUMBER OF POSITION YOU WANT TO SHIFT: ");
        int k=sc.nextInt();
        for( int i=0;i<k;i++){
            int last=arr[num-1];
            for( int j=num-1;j>0;j--){
                arr[j]=arr[j-1];
            }
               arr[0]=last;
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}