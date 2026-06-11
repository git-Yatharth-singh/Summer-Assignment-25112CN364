import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        int []arr2=new int[num];
        for( int i=0;i<num;i++){
        System.out.println("ENTER THE ELEMENTs:");
        arr[i]=sc.nextInt();
        }
        int d=0;
        for(int i=0;i<arr.length;i++){
            boolean dup = false;
                for(int j=0;j<i;j++){
                    if(arr[i]==arr[j]){
                    dup=true;
                    break;
                }
            }
            if(!dup){
                arr2[d]=arr[i];
                d++;
            }

        }
        System.out.println("ARRAY AFTER REMOVING DUPLICATES:");

        for(int i = 0; i < d; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}