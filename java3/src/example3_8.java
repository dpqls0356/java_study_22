//배열 객체에서 length의 사용을 알려주는 예시
import java.util.*;
public class example3_8 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        int array[] = new int[5];

        System.out.print("5개의 정수를 입력하세요 >>");

        for(int i = 0 ; i<array.length;i++){
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i = 0; i<array.length;i++){
            sum +=array[i];
        }
        System.out.println("평균은 "+(double)sum/array.length);
    }
}
