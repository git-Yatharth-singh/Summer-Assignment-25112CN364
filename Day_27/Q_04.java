import java.util.Scanner;
public class Q_04{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]roll=new int[100];
        String[]name=new String[100];
        int[]m1=new int[100];
        int[]m2=new int[100];
        int[]m3=new int[100];
        int[]total=new int[100];
        double[]percentage=new double[100];
        int count=0;
        int choice;
        do{
            System.out.println("\n-----Marksheet Generation System-----");
            System.out.println("1.Add Student");
            System.out.println("2.Display Marksheet");
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
                    System.out.print("Enter Marks in Subject 1: ");
                    m1[count]=sc.nextInt();
                    System.out.print("Enter Marks in Subject 2: ");
                    m2[count]=sc.nextInt();
                    System.out.print("Enter Marks in Subject 3: ");
                    m3[count]=sc.nextInt();
                    total[count]=m1[count]+m2[count]+m3[count];
                    percentage[count]=total[count]/3.0;
                    count++;
                    System.out.println("Record Added Successfully.");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No Records Found.");
                    }
                    else{
                        System.out.println("Roll\t\tName\t\tTotal\t\tPercentage");
                        for(int i=0;i<count;i++){
                            System.out.println(roll[i]+"\t\t"+name[i]+"\t\t"+total[i]+"\t\t"+percentage[i]);
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
                            System.out.println("Subject 1: "+m1[i]);
                            System.out.println("Subject 2: "+m2[i]);
                            System.out.println("Subject 3: "+m3[i]);
                            System.out.println("Total: "+total[i]);
                            System.out.println("Percentage: "+percentage[i]);
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
                                m1[j]=m1[j+1];
                                m2[j]=m2[j+1];
                                m3[j]=m3[j+1];
                                total[j]=total[j+1];
                                percentage[j]=percentage[j+1];
                            }
                            count--;
                            deleted=true;
                            System.out.println("Record Deleted.");
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