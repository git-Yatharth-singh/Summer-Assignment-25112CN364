import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int num,dig,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        sum=Sum0fDigit(num);
        System.out.println(sum);

    }
    static int Sum0fDigit(int n){
    if(n==0){
        return 0;
    }
    else{
        return n%10+Sum0fDigit(n/10);
    }
    }
}