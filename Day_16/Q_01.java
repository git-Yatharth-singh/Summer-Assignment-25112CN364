import java.util.*;

public class Q_01{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE LENGTH OF THE ARRAY:");
        int num = sc.nextInt();

        int[] arr = new int[num];

        int max = 0;
        int sum = 0;

        for(int i = 0; i < num; i++) {
            System.out.println("ENTER THE ELEMENT:");
            arr[i] = sc.nextInt();

            sum += arr[i];

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int exp = (max * (max + 1)) / 2;

        int miss = exp - sum;

        System.out.println("MISSING NUMBER IS: " + miss);
    }
}