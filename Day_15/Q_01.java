import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int num,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        int []rev=new int[num];
        for( int i=0;i<num;i++){
        System.out.println("ENTER THE ELEMENTs:");
        arr[i]=sc.nextInt();
        }
        for(int i=num-1;i>=0;i--){
        rev[i]=arr[c];
        c++;
        }
        System.out.print("REVERSE OF THE ARRAY: ");
        for(int i=0;i<num;i++){
        System.out.print(rev[i]+" ");
        }
    }
}