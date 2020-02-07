package subjects.inheritance;

public class Bike extends Vehicle {

    @Override
    public void accelerate(int delta) {
        System.out.println("Invoking accelerate from bike");
        this.speed += delta;
    }
}
