import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num,c=0;
        boolean alreadyPrinted = false;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        for( int i=0;i<num;i++){
        System.out.print("ENTER THE ELEMENT:");
        arr[i]=sc.nextInt();
        }
        for( int i=0;i<num;i++){
            boolean printed=false;
            for( int k=0;k<i;k++){
              if(arr[i]==arr[k]){
                printed=true;
                break;
              }
            }
            if(printed){
                continue;
            }
            for( int j=i+1;j<num;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}