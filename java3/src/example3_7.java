import java.util.*;
public class example3_7 {
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int array_int[] = new int[5];
        
        System.out.println("양수 5개를 입력하시오 ");
        for(int i = 0 ; i<5;i++){
            array_int[i] = scanner.nextInt();
        }
        int bigger = array_int[0];
        for(int i =1 ; i<5;i++){
            if(bigger<array_int[i]){
                bigger =  array_int[i];
            }
        }

        System.out.println("가장 큰 수는 "+bigger+"입니다.");
        scanner.close();
    }
}
