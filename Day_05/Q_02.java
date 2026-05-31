import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int num,copy,dig,f=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        num=sc.nextInt();
        copy=num;
        while(copy!=0){
            f=1;
        dig=copy%10;
        for(int i=1;i<=dig;i++){
            f*=i;
        }
        sum+=f;
        copy=copy/10;
        }
        if(sum==num){
            System.out.println("THE NUMBER IS A STRONG NUMBER");
        }
        else{
            System.out.println("THE NUMBER IS NOT A STRONG NUMBER");
        }
    }
}