import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int num=0,copy,copy1,arm=0,i,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        num=sc.nextInt();
       copy=num;
       copy1=num;
       while(copy!=0){
        copy=copy/10;
        c++;
       }
       int dig;
       for (i = 0; i < c; i++) {
           dig=copy1%10;
           arm+=Math.pow(dig,c);
           copy1=copy1/10;
       }
       if(arm==num){
        System.out.println("THE NUMBER IS ARMSTRONG NUMBER");
       }
       else{
        System.out.println("THE NUMBER IS NOT AN ARMSTRONG NUMBER");
       }
    }
}