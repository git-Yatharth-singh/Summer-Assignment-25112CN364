import  java.util.*;
public class Q_03{
    public static void main(String[] args) {
        int a = 0;
        ArrayList <Integer> f1=new ArrayList<>();
        ArrayList <Integer> f2=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER:");
        int num1=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER:");
        int num2=sc.nextInt();
        for(int i=1;i<=num1;i++){
            if(num1%i==0){
                f1.add(i);
            }
        }
        for (int i = 1; i < num2; i++) {
            if(num2%i==0){
                f2.add(i);
            }
        }
        for(int i=0;i<f1.size();i++){
            for(int j=0;j<f2.size();j++){
        if(f1.get(i).equals(f2.get(j))){
        a=f1.get(i);
        }
    }
}
System.out.println("THE GCD OF THE TWO NUMBERS IS="+a);
}
}