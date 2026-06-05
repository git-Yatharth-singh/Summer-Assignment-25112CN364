public class Q_03{
    public static void main(String []args){
        for( int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                    System.out.print(" ");
            }
                for(int b=1;b<=i;b++){
                        System.out.print(b);
                }
                    for(int a=i-1;a>=1;a--){
                            System.out.print(a);
                    }
                    
            System.out.println("");     
        }
    }
}
