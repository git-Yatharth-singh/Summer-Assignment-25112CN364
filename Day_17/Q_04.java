import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num,num2,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF FIRST ARRAY:");
        num=sc.nextInt();
        int []arr=new int[num];
        for( int i=0;i<num;i++){
        System.out.println("ENTER THE ELEMENTs:");
        arr[i]=sc.nextInt();
        }
        System.out.println("ENTER THE LENGTH OF SECOND ARRAY:");
        num2=sc.nextInt();
        int []arr2=new int[num2];
        for( int i=0;i<num2;i++){
        System.out.println("ENTER THE ELEMENTs:");
        arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
        if(arr[i]==arr2[j]){
            arr3.add(arr2[j]);
        }
        }
        }
        System.out.println(arr3);
    }
}