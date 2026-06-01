import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int num,d,count=0;
        String bin="";
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER IN DECIMAL");
        num=sc.nextInt();
        while(num!=0){
          d=num%2;
          bin=d+bin;
          num=num/2;
          if(d==1){
          count++;
          }
        }
        System.out.println("THE NUMBER OF BITS IN THE NUMBER IS: "+count);
        
    }
}