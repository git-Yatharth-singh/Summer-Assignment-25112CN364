import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num,rev;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        rev=reverse(num,0);
        System.out.print(rev);
    }
    static int reverse(int n,int rev){
        if(n==0){
        return rev;
        }
        else{
            return reverse(n/10,rev*10+n%10);
        }
    }
}