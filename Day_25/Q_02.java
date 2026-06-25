import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER FIRST STRING:");
        String str1=sc.nextLine();
        System.out.println("ENTER SECOND STRING:");
        String str2=sc.nextLine();
        String str3="";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int [] fre1=new int[26];
        int [] fre2=new int[26];
        for(int i=0;i<str1.length();i++){
            fre1[str1.charAt(i)-'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            fre2[str2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(fre1[i]>0 && fre2[i]>0){
                int times = Math.min(fre1[i], fre2[i]);
                for(int j = 0; j < times; j++){
                str3+=(char)(i+'a');
                }
            }
        }
        System.out.println(str3);
    }
}