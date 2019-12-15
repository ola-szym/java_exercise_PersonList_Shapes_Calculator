public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        r1.wypisz();
    }

    @Override
    public double liczPole() {
        return a * b;
    }

    @Override
    public double liczObwod() {
        return 2 * a + 2 * b;
    }

    @Override
    public ShapeType typ(){
        return ShapeType.RECTANGLE;
    }

}


