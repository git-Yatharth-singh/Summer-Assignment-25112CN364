import java.util.Scanner;
public class Q_04{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]productId=new int[100];
        String[]productName=new String[100];
        int[]quantity=new int[100];
        double[]price=new double[100];
        int count=0;
        int choice;
        do{
            System.out.println("\n-----Inventory Management System-----");
            System.out.println("1.Add Product");
            System.out.println("2.Display Products");
            System.out.println("3.Search Product");
            System.out.println("4.Update Quantity");
            System.out.println("5.Delete Product");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Product ID: ");
                    productId[count]=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    productName[count]=sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    quantity[count]=sc.nextInt();
                    System.out.print("Enter Price: ");
                    price[count]=sc.nextDouble();
                    count++;
                    System.out.println("Product Added Successfully.");
                    break;
                case 2:
                    if(count==0){
                        System.out.println("No Products Available.");
                    }
                    else{
                        System.out.println("ID\tName\tQuantity\tPrice");
                        for(int i=0;i<count;i++){
                            System.out.println(productId[i]+"\t"+productName[i]+"\t"+quantity[i]+"\t\t"+price[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID To Search: ");
                    int search=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<count;i++){
                        if(productId[i]==search){
                            System.out.println("Product ID: "+productId[i]);
                            System.out.println("Product Name: "+productName[i]);
                            System.out.println("Quantity: "+quantity[i]);
                            System.out.println("Price: "+price[i]);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Product Not Found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Product ID To Update Quantity: ");
                    int update=sc.nextInt();
                    boolean updated=false;
                    for(int i=0;i<count;i++){
                        if(productId[i]==update){
                            System.out.print("Enter New Quantity: ");
                            quantity[i]=sc.nextInt();
                            updated=true;
                            System.out.println("Quantity Updated Successfully.");
                            break;
                        }
                    }
                    if(!updated){
                        System.out.println("Product Not Found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Product ID To Delete: ");
                    int del=sc.nextInt();
                    boolean deleted=false;
                    for(int i=0;i<count;i++){
                        if(productId[i]==del){
                            for(int j=i;j<count-1;j++){
                                productId[j]=productId[j+1];
                                productName[j]=productName[j+1];
                                quantity[j]=quantity[j+1];
                                price[j]=price[j+1];
                            }
                            count--;
                            deleted=true;
                            System.out.println("Product Deleted Successfully.");
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Product Not Found.");
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