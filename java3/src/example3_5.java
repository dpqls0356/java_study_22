import java.util.*;
public class example3_5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 5개를 입력하세요.");

        int sum = 0;

        for(int i = 0 ; i<5;i++){
            int num = scanner.nextInt();
            if(num<=0){
                i--;
                continue;
            }
            else{
                sum+=num;
            }
        }

        System.out.println("양수의 합은 "+sum);
        scanner.close();
    }
}
