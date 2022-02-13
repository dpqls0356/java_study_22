import java.util.Scanner;

public class example2_5 {
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하시오 : ");
        int time = scanner.nextInt();

        int hour = time/3600;
        time = time - hour*3600;
        int min  = time/60;
        time = time - min*60;
        
        System.out.println(time+min*60+hour*3600+"초는 "+hour+"시간 "+min+"분 "+time+"초입니다.");
        scanner.close();


    }
    
}
