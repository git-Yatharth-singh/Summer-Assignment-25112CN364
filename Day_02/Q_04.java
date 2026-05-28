import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int digit,rev=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        num=sc.nextInt();
        int copy=num;
        while(num!=0){
            digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
        if(copy==rev){
            System.out.println("THE NUMBER IS PALLINDROME A NUMBER");
        }
        else{
            System.out.println("THE NUMBER IS NOT A PALLINDROME NUMBER");
        }
    }
}