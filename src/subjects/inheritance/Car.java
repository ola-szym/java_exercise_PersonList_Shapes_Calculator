package subjects.inheritance;

public class Car extends Vehicle {

    @Override
    public void accelerate(int delta) {
        System.out.println("Invoking accelerate from car");
        this.speed += delta;
    }
}
