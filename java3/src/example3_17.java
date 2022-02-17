//InputMismatchException 예제
import java.util.*;
public class example3_17 {
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int sum=0;


        System.out.println("정수 3개를 입력하세요");
        for(int i= 0 ; i<3;i++){

            try{
                int num = scanner.nextInt();
                sum+=num;
            }
                catch(InputMismatchException e){
                    System.out.println("정수가 아닙니다. 다시 입력하세요!");
                    scanner.nextLine(); // 입력스트림 속 토큰을 지워줌.

                    i--;
                    continue;
                }
        }
        System.out.println("합은 "+sum);
        scanner.close();
    }
}
