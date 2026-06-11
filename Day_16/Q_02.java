import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int num,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        for( int i=0;i<num;i++){
        System.out.println("ENTER THE ELEMENTs:");
        arr[i]=sc.nextInt();
        }
        int n=0; 
        int d=0;
        int max=0;
        for (int i=0;i<num-1;i++){
            d=1;
             int check=arr[i];
            for(int j=i+1;j<num;j++){
                if(check==arr[j]){
                d++;
                }
            }
            if(max<d){
                max=d;
                n=check;
            }

        }
        if(max==1){
            System.out.println("NO NUMBER IS REPEATING.");
        }
        else{
        System.out.println( "THE NUMBER WITH HIGHEST FREQUENCY IS: " +n);
        }
    }
}