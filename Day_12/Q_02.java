import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        if(IsArmstrong(num)){
            System.out.println("THE NUMBER IS ARMSTRONG");
        }
        else{
            System.out.println("THE NUMBER IS NOT ARMSTRONG");
        }
    }
    static boolean IsArmstrong(int num){
       int copy=num;
       int copy1=num;
       int c=0;
       int arm=0;
       while(copy!=0){
        copy=copy/10;
        c++;
       }
       int dig;
       for (int i = 0; i < c; i++) {
           dig=copy1%10;
           arm+=Math.pow(dig,c);
           copy1=copy1/10;
       }
       if(arm==num){
        return true;
       }
       return false;

    }
}