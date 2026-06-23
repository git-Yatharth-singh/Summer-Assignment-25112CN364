import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        int []fre=new int[26];
        for(int i=0;i<str.length();i++){
            fre[str.charAt(i)-'a']++;
        }
        for(int i=0;i<fre.length;i++){
            if(fre[i]!=0){
                System.out.println((char)(i+'a')+"="+fre[i]);
            }
        }
    }
}