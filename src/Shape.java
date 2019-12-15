
public abstract class Shape {

    public abstract double liczPole();
    public abstract double liczObwod();

    public void wypisz() {
        System.out.println("Pole " + typ().getName() + " wynosi: " + liczPole() + " Obwód " + typ().getName() + " wynosi: " + liczObwod());
    }

    public abstract ShapeType typ();


}