import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        num=sc.nextInt();
        for(int i=0;i<num;i++){
        System.out.print(fib(i)+" ");
        }   
    }
    static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}