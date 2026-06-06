import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("MAXIMUM: "+max(num1,num2));
    }
    static int max(int n1,int n2){
    return Math.max(n1, n2);
    }
}