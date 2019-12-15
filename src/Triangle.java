public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double h;


    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public static void main(String[] args) {

        Triangle t1 = new Triangle(5,6, 7, 8);
        t1.wypisz();

    }

    @Override
    public double liczPole() {
        return 0.5*a*h;
    }

    @Override
    public double liczObwod() {
        return a+b+c;
    }

    @Override
    public ShapeType typ(){
        return ShapeType.TRIANGLE;
    }

}
