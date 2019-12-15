package kalkulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Listy {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(100);
        lista.add(2);
        lista.add(-500);

        System.out.println(lista);

        // for-each
        for (Integer element : lista) {
            System.out.println(element * 2);
        }

        HashSet<Integer> zbior = new HashSet<>();
        zbior.add(100);
        zbior.add(100);
        zbior.add(100);
        zbior.add(100);

        HashMap<String, Integer> costam = new HashMap<>();
        costam.put("Imie, nazwisko", 20);

        int value = costam.get("Imie, nazwisko");
        System.out.println(value);

    }
}
