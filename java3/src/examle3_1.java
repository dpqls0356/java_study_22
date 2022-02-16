public class examle3_1 {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for(int i = 1;i<=10;i++){
            sum+=i;
            if(i==10){
                System.out.print(i);
                break;
            }
               System.out.print(i+"+");
            
        }
        System.out.println( "="+sum);
    }
}
