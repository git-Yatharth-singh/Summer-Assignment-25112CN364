import java.util.*;

public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int num=sc.nextInt();
        sc.nextLine();
        String[] words = new String[num];
        System.out.println("Enter the words:");
        for (int i = 0; i <num; i++) {
            words[i] = sc.nextLine();
        }
        for(int i=0;i<words.length-1;i++) {
            for(int j=0;j<words.length-1-i;j++) {
                if (words[j].length()>words[j+1].length()) {
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}