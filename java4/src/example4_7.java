import java.util.Scanner;

class BookVersion3 extends Book{

    public BookVersion3(String title, String author){
        this.title = title;
        this.author = author;
    }
}
public class example4_7 {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        BookVersion3 b[] = new BookVersion3[2];

        for(int i = 0 ; i<2;i++){
            System.out.print("제목>> ");
            String title = scanner.nextLine();
            System.out.print("저자>> ");
            String author=scanner.nextLine();
            b[i] = new BookVersion3(title,author);
            
    
        }
        for(int i = 0 ; i<2;i++){
            System.out.print("("+b[i].title+", "+b[i].author+")");
        }
        scanner.close();
    }

}
