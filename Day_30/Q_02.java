import java.util.Scanner;
public class Q_02{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]bookId=new int[100];
        String[]bookName=new String[100];
        String[]author=new String[100];
        boolean[]issued=new boolean[100];
        int count=0;
        int choice;
        do{
            System.out.println("\n-----Mini Library System-----");
            System.out.println("1.Add Book");
            System.out.println("2.Display Books");
            System.out.println("3.Issue Book");
            System.out.println("4.Return Book");
            System.out.println("5.Search Book");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId[count]=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    bookName[count]=sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    author[count]=sc.nextLine();
                    issued[count]=false;
                    count++;
                    System.out.println("Book Added Successfully.");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No Books Available.");
                    }
                    else{
                        System.out.println("ID\tName\tAuthor\tStatus");
                        for(int i=0;i<count;i++){
                            String status=issued[i]?"Issued":"Available";
                            System.out.println(bookId[i]+"\t"+bookName[i]+"\t"+author[i]+"\t"+status);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID To Issue: ");
                    int issue=sc.nextInt();
                    boolean found1=false;
                    for(int i=0;i<count;i++){
                        if(bookId[i]==issue){
                            if(!issued[i]){
                                issued[i]=true;
                                System.out.println("Book Issued Successfully.");
                            }
                            else{
                                System.out.println("Book Already Issued.");
                            }
                            found1=true;
                            break;
                        }
                    }
                    if(!found1){
                        System.out.println("Book Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID To Return: ");
                    int ret=sc.nextInt();
                    boolean found2=false;
                    for(int i=0;i<count;i++){
                        if(bookId[i]==ret){
                            if(issued[i]){
                                issued[i]=false;
                                System.out.println("Book Returned Successfully.");
                            }
                            else{
                                System.out.println("Book Is Already Available.");
                            }
                            found2=true;
                            break;
                        }
                    }
                    if(!found2){
                        System.out.println("Book Not Found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Book ID To Search: ");
                    int search=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(bookId[i]==search){
                            System.out.println("Book ID: "+bookId[i]);
                            System.out.println("Book Name: "+bookName[i]);
                            System.out.println("Author: "+author[i]);
                            System.out.println("Status: "+(issued[i]?"Issued":"Available"));
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Book Not Found.");
                    }
                    break;
                case 6:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice!=6);
        sc.close();
    }
}