import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        int []fre=new int[26];
        for(int i=0;i<str.length();i++){
            fre[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(fre[str.charAt(i)-'a']!=1){
                System.out.println((str.charAt(i)));
                break;
            }
        }
    }
}