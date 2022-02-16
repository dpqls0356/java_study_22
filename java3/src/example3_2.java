import java.util.*;
public class example3_2 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count=0;

        System.out.println("정수를 입력하고 마지막에 -1를 입력하세요.");
        
        while(true){
            int x = scanner.nextInt();
            if(x==-1){
                break;
            }
            else{
                sum+=x;
                count++;
            }

        }
        System.out.println("정수의 개수는 "+count+"개이고 평균은 "+sum/count+"입니다.");
        scanner.close();
    }
}
