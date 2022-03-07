import java.util.Scanner;

class CurrencyConverter{
    static double rate;
    public static void setRate(double inputrate){
        rate = inputrate;
    }
    public static double toDollar(int krw){
        return krw/rate;
    }
    public static double toKWR(int dollar){
        return dollar*rate;
    }
}
public class example4_9 {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러)>>> ");
        double rate = scanner.nextInt();
        CurrencyConverter.setRate(rate);
        System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
        System.out.println("$100은"+CurrencyConverter.toKWR(100)+"원입니다.");

        scanner.close();
    }
}
