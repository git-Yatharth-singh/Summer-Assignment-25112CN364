import java.util.*;
public class Q_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A STRING:");
        String str=sc.nextLine();
        int c=str.length()-1;
        boolean check=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(c)){
                c--;
            }
            else{
                check=false;
                break;
            }
        }
    if(check){
        System.out.println("ITS A PLAINDROME STRING");
    }
    else{
        System.out.println("ITS NOT A PALINDROME STRING");
    }
    }
}