import java.util.Scanner;
public class Q_03{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str="";
        int choice;
        do{
            System.out.println("\n-----String Operations System-----");
            System.out.println("1.Enter String");
            System.out.println("2.Display String");
            System.out.println("3.String Length");
            System.out.println("4.Convert To Uppercase");
            System.out.println("5.Convert To Lowercase");
            System.out.println("6.Reverse String");
            System.out.println("7.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter String: ");
                    str=sc.nextLine();
                    System.out.println("String Stored Successfully.");
                    break;
                case 2:
                    if(str.equals("")){
                        System.out.println("No String Available.");
                    }
                    else{
                        System.out.println("String: "+str);
                    }
                    break;
                case 3:
                    if(str.equals("")){
                        System.out.println("No String Available.");
                    }
                    else{
                        System.out.println("Length: "+str.length());
                    }
                    break;
                case 4:
                    if(str.equals("")){
                        System.out.println("No String Available.");
                    }
                    else{
                        System.out.println("Uppercase: "+str.toUpperCase());
                    }
                    break;
                case 5:
                    if(str.equals("")){
                        System.out.println("No String Available.");
                    }
                    else{
                        System.out.println("Lowercase: "+str.toLowerCase());
                    }
                    break;
                case 6:
                    if(str.equals("")){
                        System.out.println("No String Available.");
                    }
                    else{
                        String rev="";
                        for(int i=str.length()-1;i>=0;i--){
                            rev+=str.charAt(i);
                        }
                        System.out.println("Reversed String: "+rev);
                    }
                    break;
                case 7:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice!=7);
    }
}