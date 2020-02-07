package shapes;

public abstract class Shape {

    public abstract double countField();
    public abstract double countCircuit();

    public void write() {
        System.out.println("Field " + type().getName() + " is: " + countField() + " Circuit " + type().getName() + " is: " + countCircuit());
    }

    public abstract ShapeType type();
}