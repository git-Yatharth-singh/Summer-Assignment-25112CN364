import java.util.Scanner;
public class Q_03{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]id=new int[100];
        String[]name=new String[100];
        double[]salary=new double[100];
        int count=0;
        int choice;
        do{
            System.out.println("\n-----Salary Management System-----");
            System.out.println("1.Add Employee Salary");
            System.out.println("2.Display Salary Records");
            System.out.println("3.Search Salary");
            System.out.println("4.Update Salary");
            System.out.println("5.Delete Salary Record");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Employee ID: ");
                    id[count]=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    name[count]=sc.nextLine();
                    System.out.print("Enter Salary: ");
                    salary[count]=sc.nextDouble();
                    count++;
                    System.out.println("Salary Record Added.");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No Salary Records Found.");
                    }
                    else{
                        System.out.println("ID\tName\tSalary");
                        for(int i=0;i<count;i++){
                            System.out.println(id[i]+"\t"+name[i]+"\t"+salary[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID To Search: ");
                    int search=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(id[i]==search){
                            System.out.println("Employee ID: "+id[i]);
                            System.out.println("Employee Name: "+name[i]);
                            System.out.println("Salary: "+salary[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Record Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Employee ID To Update Salary: ");
                    int update=sc.nextInt();
                    boolean updated=false;
                    for(int i=0;i<count;i++){
                        if(id[i]==update){
                            System.out.print("Enter New Salary: ");
                            salary[i]=sc.nextDouble();
                            updated=true;
                            System.out.println("Salary Updated.");
                            break;
                        }
                    }
                    if(!updated){
                        System.out.println("Record Not Found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Employee ID To Delete: ");
                    int del=sc.nextInt();
                    boolean deleted=false;
                    for(int i=0;i<count;i++){
                        if(id[i]==del){
                            for(int j=i;j<count-1;j++){
                                id[j]=id[j+1];
                                name[j]=name[j+1];
                                salary[j]=salary[j+1];
                            }
                            count--;
                            deleted=true;
                            System.out.println("Salary Record Deleted.");
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Record Not Found.");
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