import java.util.Scanner;
public class Q_01{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int choice;
        double a,b,result;
        do{
            System.out.println("\n-----Menu Driven Calculator-----");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulus");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter First Number: ");
                    a=sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    b=sc.nextDouble();
                    result=a+b;
                    System.out.println("Result: "+result);
                    break;
                case 2:
                    System.out.print("Enter First Number: ");
                    a=sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    b=sc.nextDouble();
                    result=a-b;
                    System.out.println("Result: "+result);
                    break;
                case 3:
                    System.out.print("Enter First Number: ");
                    a=sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    b=sc.nextDouble();
                    result=a*b;
                    System.out.println("Result: "+result);
                    break;
                case 4:
                    System.out.print("Enter First Number: ");
                    a=sc.nextDouble();
                    System.out.print("Enter Second Number: ");
                    b=sc.nextDouble();
                    if(b!=0){
                        result=a/b;
                        System.out.println("Result: "+result);
                    }
                    else{
                        System.out.println("Division By Zero Is Not Possible.");
                    }
                    break;
                case 5:
                    System.out.print("Enter First Number: ");
                    int x=sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    int y=sc.nextInt();
                    if(y!=0){
                        System.out.println("Result: "+(x%y));
                    }
                    else{
                        System.out.println("Division By Zero Is Not Possible.");
                    }
                    break;
                case 6:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice!=6);
    }
}