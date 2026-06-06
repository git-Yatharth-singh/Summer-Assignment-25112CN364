import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO FIND FACTORIAL FOR:");
        num=sc.nextInt();
        System.out.println("THE FACTORIAL OF THE NUMBER IS: "+fact(num));
    }
    static int fact(int num){
        int f=1;
        if(num<0){
            num=-num;
        }
        for(int i=1;i<=num;i++){
        f*=i;
        }
        if(num%2==0){
        return f;
        }
        return -f;
    }
}
