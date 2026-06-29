import java.util.Scanner;

public class Q_01{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]roll=new int[100];
        String[]name=new String[100];
        int[]marks=new int[100];
        int count=0;
        int choice;
        do{
            System.out.println("\n-----Student Record Management System-----");
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Roll Number: ");
                    roll[count]=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    name[count]=sc.nextLine();
                    System.out.print("Enter Marks: ");
                    marks[count]=sc.nextInt();
                    count++;
                    System.out.println("Student Added Successfully.");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No Student Records Found.");
                    }
                    else{
                        System.out.println("\nRoll No\tName\tMarks");
                        for(int i=0;i<count;i++){
                            System.out.println(roll[i]+"\t"+name[i]+"\t"+marks[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll Number To Search: ");
                    int search=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(roll[i]==search){
                            System.out.println("Roll Number: "+roll[i]);
                            System.out.println("Name: "+name[i]);
                            System.out.println("Marks: "+marks[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Student Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Roll Number To Delete: ");
                    int del=sc.nextInt();
                    boolean deleted=false;

                    for(int i=0;i<count;i++){
                        if(roll[i]==del){
                            for(int j=i;j<count-1;j++){
                                roll[j]=roll[j+1];
                                name[j]=name[j+1];
                                marks[j]=marks[j+1];
                            }
                            count--;
                            deleted=true;
                            System.out.println("Student Record Deleted.");
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Student Not Found.");
                    }
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