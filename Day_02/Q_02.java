import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int digit,rev=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        num=sc.nextInt();
        while(num!=0){
            digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
        System.out.println("THE REVERSE OF THE NUMBER IS: "+rev);
    }
}