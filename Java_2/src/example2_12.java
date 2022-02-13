import java.util.Scanner;

public class example2_12 {
    public static void main(String args[]){

        System.out.print("점수를 입력하시오 (0~100) : ");

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score>=90){
           System.out.println("학점은 A입니다.");
        }
        else if(score>=80){
            System.out.println("학점은 B입니다.");
        }

        else if(score>=70){
            System.out.println("학점은 C입니다.");
        }
        
        else if(score>=60){
            System.out.println("학점은 D입니다.");
        }
        else{
           System.out.println("학점은 F입니다.");
        }
        scanner.close();
    }
}
