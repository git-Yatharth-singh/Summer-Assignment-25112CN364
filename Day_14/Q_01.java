import java.util.*;
public class Q_01{
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
        System.out.println("ENTER THE ELEMENT YOU WANT TO FIND:");
        key=sc.nextInt();
        boolean find=false;
        for( int i=0;i<num;i++){
            if(arr[i]==key){
                System.out.println("ELEMENT FOUND AT INDEX: "+i);
                find=true;
            }
            
        }
        if(find!=true){
            System.out.println("ELEMENT IS NOT PRESENT IN THE ARRAY");
        }
    }
}