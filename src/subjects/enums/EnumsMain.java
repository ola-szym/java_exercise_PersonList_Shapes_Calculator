package subjects.enums;

import java.util.*;
import java.util.List;

public class EnumsMain {
    public static void main(String[] args) {
        int carType = 89;
        CarType typ = CarType.fromValue(carType);

        List<Integer> f1 = new ArrayList<>();
        Set<String> s1 = new HashSet<>();
        Map<String, String> m1 = new HashMap<>();
    }

    public static int returnSize(Map<Integer, Integer> map) {
        return map.size() * 10;
    }


//    public static int countValue(CarType carType) {
//        if (carType == CarType.DOSTAWCZY){
//            return 5000;
//        }
//    }
}
