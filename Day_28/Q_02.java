import java.util.Scanner;
public class Q_02{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]accNo=new int[100];
        String[]name=new String[100];
        double[]balance=new double[100];
        int count=0;
        int choice;
        do{
            System.out.println("\n-----Bank Account System-----");
            System.out.println("1.Create Account");
            System.out.println("2.Display Accounts");
            System.out.println("3.Deposit Money");
            System.out.println("4.Withdraw Money");
            System.out.println("5.Search Account");
            System.out.println("6.Delete Account");
            System.out.println("7.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Account Number: ");
                    accNo[count]=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    name[count]=sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    balance[count]=sc.nextDouble();
                    count++;
                    System.out.println("Account Created Successfully.");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No Accounts Found.");
                    }
                    else{
                        System.out.println("Acc No\tName\tBalance");
                        for(int i=0;i<count;i++){
                            System.out.println(accNo[i]+"\t"+name[i]+"\t"+balance[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    int dep=sc.nextInt();
                    boolean deposit=false;
                    for(int i=0;i<count;i++){
                        if(accNo[i]==dep){
                            System.out.print("Enter Deposit Amount: ");
                            balance[i]+=sc.nextDouble();
                            deposit=true;
                            System.out.println("Amount Deposited.");
                            break;
                        }
                    }
                    if(!deposit){
                        System.out.println("Account Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    int wd=sc.nextInt();
                    boolean withdraw=false;
                    for(int i=0;i<count;i++){
                        if(accNo[i]==wd){
                            System.out.print("Enter Withdrawal Amount: ");
                            double amt=sc.nextDouble();
                            if(amt<=balance[i]){
                                balance[i]-=amt;
                                System.out.println("Amount Withdrawn.");
                            }
                            else{
                                System.out.println("Insufficient Balance.");
                            }
                            withdraw=true;
                            break;
                        }
                    }
                    if(!withdraw){
                        System.out.println("Account Not Found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Account Number To Search: ");
                    int search=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(accNo[i]==search){
                            System.out.println("Account Number: "+accNo[i]);
                            System.out.println("Account Holder: "+name[i]);
                            System.out.println("Balance: "+balance[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Account Not Found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Account Number To Delete: ");
                    int del=sc.nextInt();
                    boolean deleted=false;
                    for(int i=0;i<count;i++){
                        if(accNo[i]==del){
                            for(int j=i;j<count-1;j++){
                                accNo[j]=accNo[j+1];
                                name[j]=name[j+1];
                                balance[j]=balance[j+1];
                            }
                            count--;
                            deleted=true;
                            System.out.println("Account Deleted.");
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Account Not Found.");
                    }
                    break;
                case 7:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice!=7);
        sc.close();
    }
}