import java.util.Scanner;
public class Q_03{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]ticketNo=new int[100];
        String[]name=new String[100];
        String[]destination=new String[100];
        int[]seats=new int[100];
        int count=0;
        int choice;
        do{
            System.out.println("\n-----Ticket Booking System-----");
            System.out.println("1.Book Ticket");
            System.out.println("2.Display Tickets");
            System.out.println("3.Search Ticket");
            System.out.println("4.Cancel Ticket");
            System.out.println("5.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Ticket Number: ");
                    ticketNo[count]=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    name[count]=sc.nextLine();
                    System.out.print("Enter Destination: ");
                    destination[count]=sc.nextLine();
                    System.out.print("Enter Number of Seats: ");
                    seats[count]=sc.nextInt();
                    count++;
                    System.out.println("Ticket Booked Successfully.");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No Tickets Booked.");
                    }
                    else{
                        System.out.println("Ticket No\tName\tDestination\tSeats");
                        for(int i=0;i<count;i++){
                            System.out.println(ticketNo[i]+"\t"+name[i]+"\t"+destination[i]+"\t"+seats[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Ticket Number To Search: ");
                    int search=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(ticketNo[i]==search){
                            System.out.println("Ticket Number: "+ticketNo[i]);
                            System.out.println("Passenger Name: "+name[i]);
                            System.out.println("Destination: "+destination[i]);
                            System.out.println("Seats: "+seats[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Ticket Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Ticket Number To Cancel: ");
                    int del=sc.nextInt();
                    boolean deleted=false;
                    for(int i=0;i<count;i++){
                        if(ticketNo[i]==del){
                            for(int j=i;j<count-1;j++){
                                ticketNo[j]=ticketNo[j+1];
                                name[j]=name[j+1];
                                destination[j]=destination[j+1];
                                seats[j]=seats[j+1];
                            }
                            count--;
                            deleted=true;
                            System.out.println("Ticket Cancelled Successfully.");
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Ticket Not Found.");
                    }
                    break;
                case 5:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice!=5);
        sc.close();
    }
}