package person;

import java.util.HashMap;
import java.util.Scanner;

public class PersonList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start");

        HashMap<Integer, Person> personRegister = new HashMap<>();


        int chosenOption = 0;
        int i = 1;
        do {
            System.out.println("Choose one option");
            System.out.println("1 - Add person");
            System.out.println("2 - Search for person");
            System.out.println("3 - Exit");

            chosenOption = scanner.nextInt();


            switch(chosenOption) {
                case 1:
                    System.out.println("Provide name");
                    String name = scanner.next();
                    System.out.println("Provide surname");
                    String surname = scanner.next();
                    System.out.println("Provide age");
                    int age = scanner.nextInt();
                    System.out.println("Provide street");
                    String street = scanner.next();
                    System.out.println("Provide town");
                    String town = scanner.next();

                    Adress adress = new Adress(street, town);
                    Person person = new Person(name, surname, age, adress);

                    personRegister.put(i, person);

                    System.out.println("The person: " + person + " was added to the number " + i);
                    i++;
                    break;
                case 2:
                    System.out.println("Provide the number of person");
                    int number = scanner.nextInt();
                    Person concretePerson = personRegister.get(number);
                    if (concretePerson == null) {
                        System.out.println("The person was not found");
                    } else {
                        concretePerson.print();
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("You have provided the wrong number");
            }
        } while (chosenOption != 3);
    }
}
