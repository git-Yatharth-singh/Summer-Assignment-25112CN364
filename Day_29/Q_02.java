import java.util.Scanner;
public class Q_02{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[100];
        int n=0;
        int choice;
        do{
            System.out.println("\n-----Array Operations System-----");
            System.out.println("1.Insert Elements");
            System.out.println("2.Display Array");
            System.out.println("3.Search Element");
            System.out.println("4.Find Maximum");
            System.out.println("5.Find Minimum");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Number Of Elements: ");
                    n=sc.nextInt();
                    System.out.println("Enter Elements:");
                    for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                    }
                    System.out.println("Elements Inserted Successfully.");
                    break;
                case 2:
                    if(n==0){
                        System.out.println("Array Is Empty.");
                    }
                    else{
                        System.out.print("Array Elements: ");
                        for(int i=0;i<n;i++){
                            System.out.print(arr[i]+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if(n==0){
                        System.out.println("Array Is Empty.");
                    }
                    else{
                        System.out.print("Enter Element To Search: ");
                        int search=sc.nextInt();
                        boolean found=false;
                        for(int i=0;i<n;i++){
                            if(arr[i]==search){
                                System.out.println("Element Found At Index "+i);
                                found=true;
                                break;
                            }
                        }
                        if(!found){
                            System.out.println("Element Not Found.");
                        }
                    }
                    break;
                case 4:
                    if(n==0){
                        System.out.println("Array Is Empty.");
                    }
                    else{
                        int max=arr[0];
                        for(int i=1;i<n;i++){
                            if(arr[i]>max){
                                max=arr[i];
                            }
                        }
                        System.out.println("Maximum Element: "+max);
                    }
                    break;
                case 5:
                    if(n==0){
                        System.out.println("Array Is Empty.");
                    }
                    else{
                        int min=arr[0];
                        for(int i=1;i<n;i++){
                            if(arr[i]<min){
                                min=arr[i];
                            }
                        }
                        System.out.println("Minimum Element: "+min);
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