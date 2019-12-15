public class Square extends Shape {

   private double a;

    public Square(double a){
        this.a = a;
    }

    public static void main(String[] args) {
        Square s1 = new Square(5);
        boolean isCorrect = s1.liczObwod() == 21;
        System.out.println(isCorrect);
        s1.wypisz();

    }

    @Override
    public double liczPole() {
        return a*a;
    }

    @Override
    public double liczObwod() {
        return 4*a;
    }

    @Override
    public ShapeType typ(){
        return ShapeType.SQUARE;
    }

}
