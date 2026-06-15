import java.util.*;
public class Q_02{
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

        for(int i=0;i<num;i++){
            arr3.add(arr[i]);
        }
        for(int i =num;i<(num+num2);i++){
            arr3.add(arr2[c]);
            c++;
        }
        for(int i=0;i<arr3.size();i++){
            for(int j=i+1;j<arr3.size();j++){
        if(arr3.get(i).equals(arr3.get(j))){
            arr3.remove(j);
            j--;
        }
            }
        }
        System.out.println(arr3);
    }
}