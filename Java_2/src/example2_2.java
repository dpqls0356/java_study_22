import java.util.Scanner;

public class example2_2 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14;
        int radius;
        System.out.print("반지름을 입력하시오 : ");
        radius = scanner.nextInt();
        System.out.println("원의 면적  = "+PI*radius*radius);
        scanner.close();
    }
}
