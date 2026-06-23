import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        int []fre=new int[26];
        for(int i=0;i<str.length();i++){
            fre[str.charAt(i)-'a']++;
        }
        int max=fre[0];
        int pos=0;
        for(int i=0;i<26;i++){
            if(max<fre[i]){
                max=fre[i];
                pos=i;
            }
        }
        System.out.println("MAXIMUM OCCURING CHARACTER : "+(char)(pos+'a'));
    }
}