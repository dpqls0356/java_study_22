//NumberFormatException 예제
import java.util.*;
public class example3_18 {
    public static void main(String args[]){

        Scanner scanner =  new Scanner(System.in);

        while(true){
            System.out.print("데이터 타입을 정수로 바꾸고 싶은 수를 입력하시오 (종료 : exit) : ");
            String num = scanner.next();
            if(num.equals("exit")){
                break;
            }
            try{
                int changeNum = Integer.parseInt(num);
                System.out.println("정수로 변환된 값 : "+changeNum);
            }
            catch(NumberFormatException e){
                System.out.println(num+"은 정수로 변환할 수 없습니다.");
            }

        }
        scanner.close();
    }
    
}
