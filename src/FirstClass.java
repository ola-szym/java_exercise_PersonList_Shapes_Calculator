public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        int a = 1;
        int b = 2;
        int c = a + b;

        System.out.println(c);

        boolean x = true;
        boolean y = false;

        System.out.println(x&&y);

        for (int i = 0; i<10; i++) {
            for (int j = 0; j<10; j++) {
                // System.out.println("i = " + i + "j = " + j);
                System.out.println(i * 10 + j);
            }
        }


        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;

        } while (i<10);


        if (false) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }

        int z = 9;
        if (z%2 == 0) {
            System.out.println(z + " jest podzielne przez 2");
        } else if (z%3 == 0){
            System.out.println(z + " jest podzielne przez 3");

        } else {
            System.out.println("xxxx");
        }

        int[] tablicaZnakow = new int[10];
        //tablicaZnakow[0] = 5;

        for (i = 0; i<10; i++) {
            tablicaZnakow[i] = i+1;
        }
//
        for (i = 0; i<tablicaZnakow.length; i++) {

            System.out.println(tablicaZnakow[2]);
        }

        int p = 10;
        p += 5;
        p = p + 5;

        int zzzz = 5>4 ? 10 : 4;
        System.out.println(zzzz);

    }
}


