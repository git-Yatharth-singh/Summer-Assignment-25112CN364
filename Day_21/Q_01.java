import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        int i=0;
        char [] arr= str.toCharArray();
        for(char ch : arr){
            i++;
        }
        System.out.println("THE LENGTH OF THE STRING IS: "+i);
    }
}