package shapes;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        r1.write();
    }

    @Override
    public double countField() {
        return a * b;
    }

    @Override
    public double countCircuit() {
        return 2 * a + 2 * b;
    }

    @Override
    public ShapeType type(){
        return ShapeType.RECTANGLE;
    }

}


