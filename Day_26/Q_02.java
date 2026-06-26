import java.util.*;

public class Q_02{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        if(age<0 || age>120){
            System.out.println("Enter a valid age!");
        }
        else if(age>=18){
            System.out.println("Congratulations "+name+"!");
            System.out.println("You are eligible to vote.");
        }
        else if(age<18){
            System.out.println("Sorry "+name+"!");
            System.out.println("You are not eligible to vote.");
            int eligible=18-age;
            System.out.println("You can vote after "+eligible+" years!");
        }

    }
}