import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        int c=0,copy,copy1,copy2,arm=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STARTING POINT:");
        int num1=sc.nextInt();
        System.out.println("ENTER THE ENDING POINT:");
        int num2=sc.nextInt();
        System.out.println("THE ARMSTRONG NUMBERS IN THIS RANGE ARE:");
        for(int i=num1;i<=num2;i++){
            copy=i;
            copy1=i;
            copy2=i;
            c=0;
            arm=0;
            while(copy2!=0){
                copy2=copy2/10;
            c++;
            }
            int dig;
            for (int j = 0; j < c; j++) {
            dig=copy%10;
            arm+=Math.pow(dig,c);
            copy=copy/10;
            }
            if(arm==copy1){
                System.out.println(arm+" ");
            }
        }
    }
}
    