import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int num,d;
        String bin="";
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER IN DECIMAL");
        num=sc.nextInt();
        while(num!=0){
          d=num%2;
          bin=d+bin;
          num=num/2;
        }
        System.out.println("NUMBER IN BINARY= "+bin);
        
    }
}