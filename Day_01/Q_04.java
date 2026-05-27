
import java.util.Scanner;

public class Q_04{
    public static void main(String[] args) {
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int a=sc.nextInt();
        while(a!=0){
            c++;
            a=a/10;
        }
        System.out.println("THE NUMBER OF DIGITS ARE:"+c);
    }
}