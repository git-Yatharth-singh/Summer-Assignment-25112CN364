import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int a=0,b=1,c,temp;
        
        Scanner sc =new Scanner(System.in);
       System.out.println("ENTER THE NUMBER TILL WHICH YOU WANT THE FIBONACCI SERIES TO GO:");
       int n=sc.nextInt();
        System.out.print(a+" "+b+" ");
       for (int i = 1; i <=n; i++) {
        
           c=a+b;
           
           temp=b;
           b=c;
           a=temp;
        System.out.print(c+" ");
       }
    }
}