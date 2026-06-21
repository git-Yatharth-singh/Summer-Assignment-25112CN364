import java.util.*;
public class Q_03{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        int Vcount=0;
        int Ccount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            char lower=Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                Vcount++;
            }
            else if (lower >= 'a' && lower <= 'z') {
            Ccount++; 
}
        }
        System.out.println("THE NUMBER OF VOWELS ARE: "+Vcount);
        System.out.println("THE NUMBER OF CONSONANTS ARE: "+Ccount);
    }
}