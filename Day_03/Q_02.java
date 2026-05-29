import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int a = sc.nextInt();

        System.out.print("Enter end of range: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i);
            }
        }

        
    }
}