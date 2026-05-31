import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        for( int i=1;i<num;i++){
            if(num%i==0){
               sum+=i;
            }
        }
        if(sum==num){
            System.out.println("THE NUMBER IS A PERFECT NUMBER");
        }
        else{
            System.out.println("THE NUMBER IS NOT A PERFECT NUMBER");
        }
    }
}