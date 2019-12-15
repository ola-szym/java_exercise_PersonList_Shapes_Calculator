package kalkulator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start");

        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();

        int wybranaOpcja = 0;
        do {
            System.out.println("Wybierz jedną z opcji");
            System.out.println("1 - dodawanie");
            System.out.println("2 - odejmowanie");
            System.out.println("3 - wyjście");

            wybranaOpcja = scanner.nextInt();

            int c;

            switch(wybranaOpcja) {
                case 1:
                    c = a+b;
                    System.out.println("Wynik dodawania to: " + c);
                    break;
                case 2:
                    c = a-b;
                    System.out.println("Wynik odejmowania to: " + c);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Podałeś złą liczbę");
            }
        } while (wybranaOpcja != 3);
    }
}
