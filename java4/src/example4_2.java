import java.util.*;
class Rectangle{

    int width;
    int height;
    int getArea(){
        return width*height;
    }
    public Rectangle(int wid,int hei){
        width = wid;
        height=hei;
    }
}
public class example4_2 {
    public static void main(String  args[]){
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        
        Rectangle rect = new Rectangle(width,height);
        int area = rect.getArea();
        System.out.println("사각형의 면적은 "+area);
        scanner.close();

    }
}
