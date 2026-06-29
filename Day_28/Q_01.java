import java.util.Scanner;
public class Q_01{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]bookId=new int[100];
        String[]bookName=new String[100];
        String[]author=new String[100];
        int count=0;
        int choice;
        do{
            System.out.println("\n-----Library Management System-----");
            System.out.println("1.Add Book");
            System.out.println("2.Display Books");
            System.out.println("3.Search Book");
            System.out.println("4.Delete Book");
            System.out.println("5.Exit");
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
                    count++;
                    System.out.println("Book Added Successfully.");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No Books Available.");
                    }
                    else{
                        System.out.println("Book ID\tBook Name\tAuthor");
                        for(int i=0;i<count;i++){
                            System.out.println(bookId[i]+"\t"+bookName[i]+"\t"+author[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID To Search: ");
                    int search=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(bookId[i]==search){
                            System.out.println("Book ID: "+bookId[i]);
                            System.out.println("Book Name: "+bookName[i]);
                            System.out.println("Author: "+author[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Book Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID To Delete: ");
                    int del=sc.nextInt();
                    boolean deleted=false;
                    for(int i=0;i<count;i++){
                        if(bookId[i]==del){
                            for(int j=i;j<count-1;j++){
                                bookId[j]=bookId[j+1];
                                bookName[j]=bookName[j+1];
                                author[j]=author[j+1];
                            }
                            count--;
                            deleted=true;
                            System.out.println("Book Deleted Successfully.");
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Book Not Found.");
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