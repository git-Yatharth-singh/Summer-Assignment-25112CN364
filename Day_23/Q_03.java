import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER FIRST STRING:");
        String str1=sc.nextLine();
        System.out.println("ENTER SECOND STRING:");
        String str2=sc.nextLine();
        if(str1.length() != str2.length()){
        System.out.println("NOT ANAGRAM STRINGS");
        return;
        }
        int []fre1=new int[26];
        int []fre2=new int[26];
        boolean check=false;
        for(int i=0;i<str1.length();i++){
            fre1[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            fre2[str2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(fre1[i]!=fre2[i]){
                check=true;
            }
        }
        if(check){
            System.out.println("NOT ANAGRAM STRINGS");
        }
        else{
            System.out.println("ANAGRAM STRINGS");
        }
    }
}