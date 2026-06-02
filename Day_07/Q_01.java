import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int num,fac;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        num=sc.nextInt();
        fac=fact(num);
        System.out.println("THE FACTORIAL OF THE NUMBER IS: "+fac);
    }
    static int fact(int n){
    if(n==1){
        return 1;
    }
    else{
        return n*fact(n-1);
    }
}
}
