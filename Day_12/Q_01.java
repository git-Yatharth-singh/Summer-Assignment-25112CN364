import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        if(IsPallindrome(num)){
            System.out.println("THE NUMBER IS PALLINDROME");
        }
        else{
            System.out.println("THE NUMBER IS NOT PALLINDROME");
        }
    }
    static boolean IsPallindrome(int num){
        int copy=num,rev=0;
        while(copy!=0){
            int d=copy%10;
            rev=rev*10+d;
            copy=copy/10;
        }
        if(rev==num){
            return true;
        }
        return false;
    }
}