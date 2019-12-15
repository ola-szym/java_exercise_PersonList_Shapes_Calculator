public class Circle extends Shape {

   private double r;
   private static final double pi = 3.14;


    public Circle(double r) {
        this.r = r;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(1);
        c1.wypisz();

    }


    @Override
    public double liczPole() {
        return pi*r*r;
    }

    @Override
    public double liczObwod() {
        return 2*pi*r;
    }

    @Override
    public ShapeType typ(){
        return ShapeType.CIRCLE;
    }

}
