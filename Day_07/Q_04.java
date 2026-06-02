import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        System.out.print(reverse(num, 0));
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