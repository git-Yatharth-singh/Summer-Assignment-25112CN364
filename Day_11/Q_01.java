import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS FOR FINDING SUM:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        sum=Add(num1,num2);
        System.out.println("THE SUM OF THE GIVEN NUMBER: "+sum);
    }
    static int Add(int n1,int n2){
    return (n1+n2);
    }
}