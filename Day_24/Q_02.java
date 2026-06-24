import java.util.*;
public class Q_02{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine().toLowerCase();
        if (str.length() == 0) {
            System.out.println("THE STRING IS NOT COMPRESSIBLE");
            return;
        }
        StringBuilder compString=new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char currChar = str.charAt(i);
            int count = 0;
            while (i < str.length() && str.charAt(i) == currChar) {
                count++;
                i++;
            }
            compString.append(currChar);
            compString.append(count);
        }
        if(str.length()<=compString.length()){
            System.out.println("THE STRING IN NOT COMPRESSIBLE");
            return;
        }
        else{
            System.out.println("THE COMPRESSED STRING IS: "+compString);
        }
    }
    
}