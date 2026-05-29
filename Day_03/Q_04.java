import java.util.*;

public class Q_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE FIRST NUMBER:");
        int num1 = sc.nextInt();

        System.out.println("ENTER THE SECOND NUMBER:");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);

        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }
    }
}