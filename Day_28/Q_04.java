import java.util.Scanner;
public class Q_04{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[]name=new String[100];
        String[]phone=new String[100];
        String[]email=new String[100];
        int count=0;
        int choice;
        do{
            System.out.println("\n-----Contact Management System-----");
            System.out.println("1.Add Contact");
            System.out.println("2.Display Contacts");
            System.out.println("3.Search Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter Name: ");
                    name[count]=sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    phone[count]=sc.nextLine();
                    System.out.print("Enter Email: ");
                    email[count]=sc.nextLine();
                    count++;
                    System.out.println("Contact Added Successfully.");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No Contacts Found.");
                    }
                    else{
                        System.out.println("Name\tPhone\tEmail");
                        for(int i=0;i<count;i++){
                            System.out.println(name[i]+"\t"+phone[i]+"\t"+email[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Name To Search: ");
                    String search=sc.nextLine();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(name[i].equalsIgnoreCase(search)){
                            System.out.println("Name: "+name[i]);
                            System.out.println("Phone: "+phone[i]);
                            System.out.println("Email: "+email[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Contact Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Name To Delete: ");
                    String del=sc.nextLine();
                    boolean deleted=false;
                    for(int i=0;i<count;i++){
                        if(name[i].equalsIgnoreCase(del)){
                            for(int j=i;j<count-1;j++){
                                name[j]=name[j+1];
                                phone[j]=phone[j+1];
                                email[j]=email[j+1];
                            }
                            count--;
                            deleted=true;
                            System.out.println("Contact Deleted Successfully.");
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Contact Not Found.");
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