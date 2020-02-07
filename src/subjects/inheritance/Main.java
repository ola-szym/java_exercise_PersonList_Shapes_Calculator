package subjects.inheritance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Car or bike?");
        Scanner scanner = new Scanner(System.in);
        String chosenOption = scanner.next();

        Vehicle vehicle = null;
        if(chosenOption.equals("car")) {
            vehicle = new Car();
        } else if (chosenOption.equals("bike")) {
            vehicle = new Bike();
        }
        accelerateBy(vehicle, 10);
    }

    public static void accelerateBy(Vehicle vehicle, int delta) {
        System.out.println("Speeding by " + delta);
        vehicle.accelerate(delta);
    }


}