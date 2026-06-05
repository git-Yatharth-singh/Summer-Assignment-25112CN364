public class Q_04{
    public static void main(String []args){
        for( int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                    System.out.print(" ");
            }
                for(char b=0;b<i;b++){
                        System.out.print((char)('A'+b));
                }
                    for(int a=i-2;a>=0;a--){
                            System.out.print((char)('A'+a));
                    }
                    
            System.out.println("");     
        }
    }
}
