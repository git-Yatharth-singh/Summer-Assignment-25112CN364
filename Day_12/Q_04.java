import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        if(IsPerfect(num)){
            System.out.println("THE NUMBER IS A PERFECT NUMBER");
        }
        else{
            System.out.println("THE NUMBER IS NOT A PERFECT NUMBER");
        }
    }
    static boolean IsPerfect(int num){
        int sum=0;
        for( int i=1;i<num;i++){
            if(num%i==0){
               sum+=i;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}