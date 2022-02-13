import java.util.Scanner;

public class example2_13 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하시오 (0~100) : ");
        int score = scanner.nextInt();
        System.out.print("학년을 입력하시오 : ");
        int grade = scanner.nextInt();

        if((grade==4&&score>=70)||(grade!=4&&score>=60)){
            System.out.println("합격!");
        }
        else{
            System.out.println("불합격!");
        }
        scanner.close();
    }
        
}
