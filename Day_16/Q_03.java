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
        System.out.println("ENTER THE SUM OF THE ELEMENTS: ");
        int sum=sc.nextInt();
        System.out.println("THE PAIRS ARE:");
        for( int i =0;i<num-1;i++){
            for(int j=i;j<num;j++){
                if((arr[i]+arr[j])==sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}