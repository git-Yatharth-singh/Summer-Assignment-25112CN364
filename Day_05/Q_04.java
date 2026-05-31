import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int num,f=0,c=0,prime=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            c=0;
            if(num%i==0){
                f=i;
            for(int j=1;j<=f;j++){
                if(f%j==0){
                    c++;
                } 
            }
            if(c==2){
                prime=f;
            }
            }
        }
        System.out.println("THE GREATEST PRIME FACTOR IS: "+prime);
    }
}