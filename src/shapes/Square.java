package shapes;

public class Square extends Shape {

   private double a;

    public Square(double a){
        this.a = a;
    }

    public static void main(String[] args) {
        Square s1 = new Square(5);
        boolean isCorrect = s1.countCircuit() == 21;
        System.out.println(isCorrect);
        s1.write();

    }

    @Override
    public double countField() { return a*a;
    }

    @Override
    public double countCircuit() {
        return 4*a;
    }

    @Override
    public ShapeType type(){
        return ShapeType.SQUARE;
    }

}
