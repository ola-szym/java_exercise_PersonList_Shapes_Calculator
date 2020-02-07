package subjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(2);
        list.add(-500);

        System.out.println(list);

        // for-each
        for (Integer element : list) {
            System.out.println(element * 2);
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(100);
        set.add(100);
        set.add(100);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Name, Surname", 20);

        int value = map.get("Name, Surname");
        System.out.println(value);

    }
}
