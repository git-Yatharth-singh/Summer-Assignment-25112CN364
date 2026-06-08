import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num,even=0,odd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int [num];
        System.out.println("ENTER THE ELEMENTS:");
        for( int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for( int i=0;i<num;i++){
          if(arr[i]%2==0){
            even++;
          }
          else{
            odd++;
          }
        }
        System.out.println("THE COUNT OF EVEN NUMBERS IN THE ARRAY IS: "+even);
        System.out.println("THE COUNT OF ODD NUMBERS IN THE ARRAY IS "+odd);
    }
}