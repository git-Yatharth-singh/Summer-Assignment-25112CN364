import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num,pow,count=0,ans=1;
        Scanner sc=new Scanner( System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        System.out.println("ENTER THE POWER");
        pow=sc.nextInt();
        for( int i=1;i<=pow;i++){
        ans=ans*num;
        }
        System.out.println(ans);
    }
}