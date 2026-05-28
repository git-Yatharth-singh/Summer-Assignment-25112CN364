import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int sum=0,digit;
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int num=sc.nextInt();
        while(num!=0){
            digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println("THE SUM OF THE DIGITS OF NUMBER IS="+sum);
    }
}