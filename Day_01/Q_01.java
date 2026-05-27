import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        sum=sum+i;
        }
        System.out.println("THE SUM OF NATURAL NUMBERS IS: " + sum);
        
    }
}