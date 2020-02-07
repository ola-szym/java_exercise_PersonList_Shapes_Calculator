package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start");

        System.out.println("Provide the first number");
        int a = scanner.nextInt();
        System.out.println("Provide the second number");
        int b = scanner.nextInt();

        int chosenOption = 0;
        do {
            System.out.println("Choose one option");
            System.out.println("1 - Addition");
            System.out.println("2 - Substraction");
            System.out.println("3 - Exit");

            chosenOption = scanner.nextInt();

            int c;

            switch(chosenOption) {
                case 1:
                    c = a+b;
                    System.out.println("Result of addition: " + c);
                    break;
                case 2:
                    c = a-b;
                    System.out.println("Result of substraction: " + c);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("You have provided wrong number");
            }
        } while (chosenOption != 3);
    }
}
