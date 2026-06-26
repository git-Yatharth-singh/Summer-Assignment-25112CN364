import java.util.*;

public class Q_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int comp=ran.nextInt(1, 101);
        System.out.println("Enter a number between 1 and 100");
        int choice=0;
        int count=0;
        while(choice!=comp){
            count++;
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            if(choice < 1 || choice > 100){
                System.out.println("Please enter a number between 1 and 100.");
            }
            else if(choice>comp){
                System.out.println("Too high!");
            }
            else if(choice<comp){
                System.out.println("Too low!");
            }

        }
        System.out.println("Congratulations!");
        System.out.println("The number was " + comp);
        System.out.println("You guessed the number in "+count+" attempts");
    }
}