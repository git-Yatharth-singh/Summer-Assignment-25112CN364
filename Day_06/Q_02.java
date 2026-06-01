import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int num,d,c=0,dec=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER IN BINARY:");
        num=sc.nextInt();
        while(num!=0){
        d=num%10;
        num/=10;
        dec=(int)(dec+d*Math.pow(2,c));
        c++;
        }
        System.out.println("THE NUMBER IN DECIMAL IS: "+dec);

    }
}