import java.util.*;

public class pq2_5 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하세요 >> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if(x+y>z||y+z>x||x+z>y){
            System.out.println("삼각형이 됩니다.");
        }
        else{
            System.out.println("삼각형이 되지않습니다.");
        }

    }
}
