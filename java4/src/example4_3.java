class CircleVersion2 extends Circle{
    String name;
    public CircleVersion2(){
        radius=1;
    }
    public CircleVersion2(int r,String name){
     radius=r;
     this.name = name;
    }
} 
public class example4_3 {
    public static void main(String args[]){
        CircleVersion2 pizza = new CircleVersion2(10,"자바피자");
        double area = pizza.getArea();
        CircleVersion2 donut = new CircleVersion2();
        donut.name="자바도넛";
        double donutArea = donut.getArea();

        System.out.println("자바피자의 면적은 "+area);
        System.out.println("자바도넛의 면적은 "+donutArea);


    }
}
