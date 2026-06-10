import java.util.*;
public class Q_04{
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
        int c=num-1;
        for( int i =0;i<=c;i++){
            if(arr[i]==0){
            for(int j=i;j<num-1;j++){ 
            arr[j]=arr[j+1];
           }
           arr[c]=0;
           c--;
           i--;
            }


        }
        for(int i =0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}