import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int digit,mul=1,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        num=sc.nextInt();
        while(num!=0){
            digit=num%10;
            mul*=digit;
            num=num/10;
        }
        System.out.println("THE MULTIPLICATION OF DIGITS:"+mul);
    }
}