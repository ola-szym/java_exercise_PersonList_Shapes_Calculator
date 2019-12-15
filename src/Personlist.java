import java.util.HashMap;
import java.util.Scanner;

public class Personlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start");

        HashMap<Integer, Person> rejestrOsob = new HashMap<>();


        int wybranaOpcja = 0;
        int i = 1;
        do {
            System.out.println("Wybierz jedną z opcji");
            System.out.println("1 - dodaj osobę");
            System.out.println("2 - wyszukaj osobę");
            System.out.println("3 - wyjście");

            wybranaOpcja = scanner.nextInt();


            switch(wybranaOpcja) {
                case 1:
                    System.out.println("Podaj imie");
                    String imie = scanner.next();
                    System.out.println("Podaj nazwisko");
                    String nazwisko = scanner.next();
                    System.out.println("Podaj wiek");
                    int wiek = scanner.nextInt();
                    System.out.println("Podaj ulicę");
                    String ulica = scanner.next();
                    System.out.println("Podaj miasto");
                    String miasto = scanner.next();

                    Adress nowyAdres = new Adress(ulica,miasto);
                    Person nowaOsoba = new Person(imie,nazwisko,wiek,nowyAdres);

                    rejestrOsob.put(i, nowaOsoba);

                    System.out.println("Dodano osobę: " + nowaOsoba + " do numeru " + i);
                    i++;
                    break;
                case 2:
                    System.out.println("Podaj numer osoby");
                    int numer = scanner.nextInt();
                    Person osoba = rejestrOsob.get(numer);
                    if (osoba == null) {
                        System.out.println("Nie znaleziono danej osoby");  // co jesli nie znalezlismy
                    } else {
                        osoba.print();
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Podałeś złą liczbę");
            }
        } while (wybranaOpcja != 3);
    }
}
