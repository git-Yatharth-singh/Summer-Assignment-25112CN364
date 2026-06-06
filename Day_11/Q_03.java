import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        if(CheckPrime(num)){
            System.out.println("THE NUMBER IS PRIME");
        }
        else{
            System.out.println("THE NUMBER IS NOT PRIME");
        }
    }
    static boolean CheckPrime(int num){
        int c=0;
        if(num<0){
            num=-num;
        }
        for( int i=1;i<=num;i++){
            if(num%i==0){
            c++;
            }
        }
        if(c==2){
            return true;
        }
        return false;
    }
}