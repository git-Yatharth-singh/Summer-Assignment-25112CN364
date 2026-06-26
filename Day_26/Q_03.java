import java.util.*;
public class Q_03{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int balance=0;
        System.out.print("Create a 4-digit PIN: ");
        int pin=sc.nextInt();
        System.out.print("Enter PIN: ");
        int enteredPin=sc.nextInt();
        if(enteredPin!=pin){
            System.out.println("Incorrect PIN");
            return;
        }
        boolean run=true;
        while(run){
            System.out.println("\n1.Check Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Change PIN");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Balance: "+balance);
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    int deposit=sc.nextInt();
                    if(deposit>0){
                        balance+=deposit;
                        System.out.println("Deposit Successful");
                    }
                    else{
                        System.out.println("Invalid Amount");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    int withdraw=sc.nextInt();
                    if(withdraw<=0){
                        System.out.println("Invalid Amount");
                    }
                    else if(withdraw>balance){
                        System.out.println("Insufficient Balance");
                    }
                    else{
                        balance-=withdraw;
                        System.out.println("Withdrawal Successful");
                    }
                    break;
                case 4:
                    System.out.print("Enter Current PIN: ");
                    int current=sc.nextInt();
                    if(current==pin){
                        System.out.print("Enter New PIN: ");
                        pin=sc.nextInt();
                        System.out.println("PIN Changed Successfully");
                    }
                    else{
                        System.out.println("Incorrect PIN");
                    }
                    break;
                case 5:
                    run=false;
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}