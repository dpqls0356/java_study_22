import java.util.*;

public class pq2_4 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력 >>");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if((x>y&&x<z)||(x<y&&x>z)){
            System.out.println("중간 값은 "+x);
        }
        else if((y>x&&y<z)||(y<x&&y>z)){
            System.out.println("중간 값은 "+y);
        }
        else{
            System.out.println("중간 값은 "+z);
        }
    }
}
