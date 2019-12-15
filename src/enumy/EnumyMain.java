package enumy;

import java.util.*;
import java.util.List;

public class EnumyMain {
    public static void main(String[] args) {
        int typSamochodu = 89;
        TypSamochodu typ = TypSamochodu.fromValue(typSamochodu);

        List<Integer> f1 = new ArrayList<>();
        Set<String> s1 = new HashSet<>();
        Map<String, String> m1 = new HashMap<>();
    }

    public static int costam(Map<Integer, Integer> mapa) {
        return mapa.size() * 10;
    }



//    public static int obliczWartosc(TypSamochodu typSamochodu) {
//        if (typSamochodu == TypSamochodu.DOSTAWCZY){
//            return 5000;
//        }
//    }
}
