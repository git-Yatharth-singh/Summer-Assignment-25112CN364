import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF NAMES: ");
        int num=sc.nextInt();
        String []arr=new String[num];
        System.out.println("ENTER THE NAMES: ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextLine();
        }
         for (int i=0;i<num-1;i++) {
            for (int j=i+1;j<num;j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}