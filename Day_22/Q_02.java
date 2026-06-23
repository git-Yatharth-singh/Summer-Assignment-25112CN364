import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        String cleanString=str.trim();
        String []words=cleanString.split("\\s+");
        System.out.println(words.length);
    }
}