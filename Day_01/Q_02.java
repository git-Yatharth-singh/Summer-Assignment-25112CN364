import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int mul;
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER: ");
       int n=sc.nextInt();
       for(int i=1;i<=10;i++){
       mul=n*i;
       System.out.println(n+"*"+i+"="+mul);
       } 
       
    }
    
}