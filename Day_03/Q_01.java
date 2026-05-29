import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        int num,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("THE NUMBER IS PRIME");
        }
        else{
            System.out.println("THE NUMBER IS NOT PRIME");
        }
    }
}