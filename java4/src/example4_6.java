class CircleVersion3 extends Circle{
    public CircleVersion3(int radius){
        this.radius = radius;
    }
}
public class example4_6 {
    public static void main(String args[]){

        CircleVersion3 c[]=new CircleVersion3[5];

        for(int i =0 ; i<5;i++){
            c[i] = new CircleVersion3(i);
            System.out.println((int)(c[i].getArea()));
        }

    }
    
}
