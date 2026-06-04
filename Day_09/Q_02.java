public class Q_02{
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            int c=0;
            for(int j=1;j<=5-i+1;j++){
                c++;
                System.out.print(c+" ");
            }
            System.out.println("");
        }
    }
}