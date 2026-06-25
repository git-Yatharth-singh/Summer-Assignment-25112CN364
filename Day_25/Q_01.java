import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST SORTED ARRAY LENGTH: ");
        int num1=sc.nextInt();
        int []arr1=new int[num1];
        System.out.println("ENTER THE FIRST ARRAY ELEMENTS: ");
        for(int i = 0;i<num1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("ENTER SECOND SORTED ARRAY LENGTH: ");
        int num2=sc.nextInt();
        int []arr2=new int[num2];
        System.out.println("ENTER THE SECOND ARRAY ELEMENTS: ");
        for(int i = 0;i<num2;i++){
            arr2[i]=sc.nextInt();
        }
        int []arr3= new int[num1+num2];
        int ptr1=0;
        int ptr2=0;
        for(int i=0;i<arr3.length;i++){
            if(ptr1>=arr1.length){
                arr3[i]=arr2[ptr2];
                ptr2++;
                continue;
            }
            else if(ptr2>=arr2.length){
                arr3[i]=arr1[ptr1];
                ptr1++;
                continue;
            }

            if(arr1[ptr1]<arr2[ptr2]){
                arr3[i]=arr1[ptr1];
                ptr1++;
            }
            else{
                arr3[i]=arr2[ptr2];
                ptr2++;
            }
        }
        for(int i =0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}