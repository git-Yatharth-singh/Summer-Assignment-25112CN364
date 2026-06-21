import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        String lowerStr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=65 && ch<=90){
                ch=(char)(ch+32);
            }
            lowerStr+=ch;
        }
        System.out.println("STRING IN LOWER CASE: "+lowerStr);
    }
}