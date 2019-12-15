package inheritance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Car czy bike?");
        Scanner scanner = new Scanner(System.in);
        String wybranaOpcja = scanner.next();

        Vehicle vehicle = null;
        if(wybranaOpcja.equals("car")) {
            vehicle = new Car();
        } else if (wybranaOpcja.equals("bike")) {
            vehicle = new Bike();
        }
        accelerateBy(vehicle, 10);
    }

    public static void accelerateBy(Vehicle vehicle, int delta) {
        System.out.println("Przyspieszam o " + delta);
        vehicle.accelerate(delta);
    }


}