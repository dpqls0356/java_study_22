import java.util.Scanner;

public class example2_10 {
    
    public static void main(String args[]){

        System.out.print("점수를 입력하시오 : ");

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score>=80){
            System.out.print("축하합니다! 합격입니다.");
        }
        else{
            System.out.print("불합격입니다.");
        }

        scanner.close();

    }
}
