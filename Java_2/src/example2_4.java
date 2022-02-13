import java.util.Scanner;

public class example2_4 {
     
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름, 도시, 나이, 체중, 독신 여부(ture, false)를 빈칸으로 분리하여 입력하세요.");
        String name = scanner.next();
        String city=scanner.next(); 
        int age = scanner.nextInt();
        int weight = scanner.nextInt();
        boolean marry = scanner.nextBoolean();

        System.out.println("이름은 "+name+" 도시는 "+city+" 나이는 "+age+" 몸무게는 "+weight+" 결혼여부는 "+marry);

        scanner.close();
    }
}
