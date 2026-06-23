import java.util.*;
public class Q_04{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        String cleanString=str.trim();
        String []words=cleanString.split("\\s+");
        StringBuilder noSpace=new StringBuilder();
        for(int i=0;i<words.length;i++){
            noSpace.append(words[i]);
        }
        System.out.println(noSpace);
    }
}