import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER FIRST STRING:");
        String str1=sc.nextLine();
        System.out.println("ENTER SECOND STRING:");
        String str2=sc.nextLine();
        if(str1.length() != str2.length()){
        System.out.println("STRING ROTATION NOT POSSIBLE");
        return;
        }
        String addString=str1+str1;
        if(addString.contains(str2)){
            System.out.println("STRING ROTATION POSSIBLE");
        }
        else{
            System.out.println("STRING ROTATION NOT POSSIBLE");
        }
    }
}