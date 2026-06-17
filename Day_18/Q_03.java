import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        for( int i=0;i<num;i++){
        System.out.println("ENTER THE ELEMENT:");
        arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE ELEMENT YOU WANT TO FIND: ");
        int key=sc.nextInt();
        int big=0;
        int end=num-1;
        boolean found=false;
        while(big<=end){
            int mid=(big+end)/2;

            if(arr[mid]==key){
                System.out.println("KEY FOUND AT: "+ mid);
                found=true;
                break;
            }
            else if(arr[mid]>key){
                end--;;
            }
            else if(arr[mid]<key){
                big++;
            }
        }
        if(!found){
            System.out.println("THE ELEMENT IS NOT PRESENT IN THE ARRAY");
        }
    }
}