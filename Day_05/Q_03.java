import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        num=sc.nextInt();
        System.out.println("FCTORS:");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }

    }
}