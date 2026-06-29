import java.util.Scanner;
public class Q_04{
    static Scanner sc=new Scanner(System.in);
    static int[]seatNo=new int[100];
    static String[]name=new String[100];
    static String[]movie=new String[100];
    static int count=0;

    static void bookTicket(){
        System.out.print("Enter Seat Number: ");
        seatNo[count]=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        name[count]=sc.nextLine();
        System.out.print("Enter Movie Name: ");
        movie[count]=sc.nextLine();
        count++;
        System.out.println("Ticket Booked Successfully.");
    }

    static void displayTickets(){
        if(count==0){
            System.out.println("No Tickets Booked.");
        }
        else{
            System.out.println("Seat\tCustomer\tMovie");
            for(int i=0;i<count;i++){
                System.out.println(seatNo[i]+"\t"+name[i]+"\t"+movie[i]);
            }
        }
    }

    static void searchTicket(){
        System.out.print("Enter Seat Number: ");
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<count;i++){
            if(seatNo[i]==search){
                System.out.println("Seat Number: "+seatNo[i]);
                System.out.println("Customer: "+name[i]);
                System.out.println("Movie: "+movie[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Ticket Not Found.");
        }
    }

    static void cancelTicket(){
        System.out.print("Enter Seat Number: ");
        int del=sc.nextInt();
        boolean deleted=false;
        for(int i=0;i<count;i++){
            if(seatNo[i]==del){
                for(int j=i;j<count-1;j++){
                    seatNo[j]=seatNo[j+1];
                    name[j]=name[j+1];
                    movie[j]=movie[j+1];
                }
                count--;
                deleted=true;
                System.out.println("Ticket Cancelled.");
                break;
            }
        }
        if(!deleted){
            System.out.println("Ticket Not Found.");
        }
    }

    public static void main(String[]args){
        int choice;
        do{
            System.out.println("\n-----Movie Ticket Booking System-----");
            System.out.println("1.Book Ticket");
            System.out.println("2.Display Tickets");
            System.out.println("3.Search Ticket");
            System.out.println("4.Cancel Ticket");
            System.out.println("5.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    bookTicket();
                    break;
                case 2:
                    displayTickets();
                    break;
                case 3:
                    searchTicket();
                    break;
                case 4:
                    cancelTicket();
                    break;
                case 5:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice!=5);
    }
}