//다차원배열
import java.util.*;
public class example3_10 {
    public static void main(String args[]){

        double score[][] = new double[4][2];

        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        for(int i = 0 ; i<4;i++){
            System.out.print(i+1+"학년 성적을 입력하시오 : ");
            for(int k = 0 ; k<2 ; k++ ){
                score[i][k] = scanner.nextDouble();
                sum+=score[i][k];
            }
        }
        System.out.println("4년 전체 평점 평균은 "+sum/8);
        scanner.close();
    }
}
