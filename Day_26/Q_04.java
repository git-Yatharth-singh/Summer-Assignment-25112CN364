import java.util.*;
public class Q_04{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("\n1.Start Quiz");
            System.out.println("2.Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    int score=0;
                    System.out.println("\nQuestion 1");
                    System.out.println("What is the capital of India?");
                    System.out.println("1.Mumbai");
                    System.out.println("2.Delhi");
                    System.out.println("3.Kolkata");
                    System.out.println("4.Chennai");
                    System.out.print("Answer: ");
                    int ans1=sc.nextInt();
                    if(ans1==2){
                        score++;
                    }
                    System.out.println("\nQuestion 2");
                    System.out.println("Which keyword is used to inherit a class in Java?");
                    System.out.println("1.implements");
                    System.out.println("2.super");
                    System.out.println("3.extends");
                    System.out.println("4.import");
                    System.out.print("Answer: ");
                    int ans2=sc.nextInt();
                    if(ans2==3){
                        score++;
                    }
                    System.out.println("\nQuestion 3");
                    System.out.println("Which loop executes at least once?");
                    System.out.println("1.for");
                    System.out.println("2.while");
                    System.out.println("3.enhanced for");
                    System.out.println("4.do-while");
                    System.out.print("Answer: ");
                    int ans3=sc.nextInt();
                    if(ans3==4){
                        score++;
                    }
                    System.out.println("\nQuestion 4");
                    System.out.println("Which data type stores decimal numbers?");
                    System.out.println("1.int");
                    System.out.println("2.double");
                    System.out.println("3.char");
                    System.out.println("4.boolean");
                    System.out.print("Answer: ");
                    int ans4=sc.nextInt();
                    if(ans4==2){
                        score++;
                    }
                    System.out.println("\nQuestion 5");
                    System.out.println("Which company developed Java?");
                    System.out.println("1.Google");
                    System.out.println("2.Microsoft");
                    System.out.println("3.Sun Microsystems");
                    System.out.println("4.Apple");
                    System.out.print("Answer: ");
                    int ans5=sc.nextInt();
                    if(ans5==3){
                        score++;
                    }
                    System.out.println("\nQuiz Finished!");
                    System.out.println("Correct Answers: "+score);
                    System.out.println("Wrong Answers: "+(5-score));
                    System.out.println("Score: "+score+"/5");
                    if(score>=3){
                        System.out.println("Result: Pass");
                    }
                    else{
                        System.out.println("Result: Fail");
                    }
                    break;
                case 2:
                    run=false;
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}