
class Circle{
    int radius;
    double getArea(){
        return radius*radius*3.14;

    }
    public Circle(){}
}
public class example4_1{
    public static void main(String args[]){

        Circle pizza = new Circle();
        pizza.radius=10;
        double area =pizza.getArea();

        Circle donut = new Circle();
        donut.radius= 2;
        double donutArea = donut.getArea();

        System.out.println("자바피자의 면적은 "+area);
        System.out.println("자바도넛의 면적은 "+donutArea);
    }
}