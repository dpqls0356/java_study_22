import java.util.*;
public class pq2_1 {
    public static void main(String agrs[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("원화를 입력하시오(단위 원)>>> ");
        int won = scanner.nextInt();
        System.out.println(won+"원은 "+won/1100+"$입니다.");

        scanner.close();
    }
}
