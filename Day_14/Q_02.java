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
        int c=0;
        System.out.println("ENTER THE ELEMENT WHOSE FREQUENCY YOU WANT TO FIND:");
        int n=sc.nextInt();
        for( int i=0;i<num;i++){
            if(arr[i]==n){
                c++;
            }
        }
        System.out.println("THE FREQUENCY OF THE ELEMENT: "+c);

    }
}