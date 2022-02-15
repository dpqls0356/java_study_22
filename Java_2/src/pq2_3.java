import java.util.*;
public class pq2_3{

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오 : ");
        int input_price = scanner.nextInt();

        System.out.println("오만원권 "+input_price/50000+"매");
        input_price = input_price%50000;        
        System.out.println("만원권 "+input_price/10000+"매");
        input_price = input_price%10000;
        System.out.println("천원권 "+input_price/1000+"매");
        input_price = input_price%1000;   
        System.out.println("백원 "+input_price/100+"개");
        input_price = input_price%100;
        System.out.println("오십원 "+input_price/50+"개");
        input_price = input_price%50;
        System.out.println("십원 "+input_price/10+"개");
        input_price = input_price%10;
        System.out.println("일원 "+input_price+"개");
        scanner.close();
           
    }
}