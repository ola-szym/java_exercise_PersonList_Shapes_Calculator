package shapes;

public class Circle extends Shape {

   private double r;
   private static final double pi = 3.14;


    public Circle(double r) {
        this.r = r;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(1);
        c1.write();

    }


    @Override
    public double countField() {
        return pi*r*r;
    }

    @Override
    public double countCircuit() {
        return 2*pi*r;
    }

    @Override
    public ShapeType type(){
        return ShapeType.CIRCLE;
    }

}
