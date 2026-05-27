import java.util.*;
public class Q_03{
public static void main(String[] args) {
    int f=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER FOR FACTORIAL: ");
    int n=sc.nextInt();
    for(int i =1;i<=n;i++){
        f=f*i;
    }
    System.out.println("THE FACTORIAL OF THE NUMBER:"+f);
}
}