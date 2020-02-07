package subjects;

public class Divisibility {
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
            System.out.println(z + " is divisible by 2");
        } else if (z%3 == 0){
            System.out.println(z + " is divisible by 3");

        } else {
            System.out.println("The number is not divisible by 2 and 3");
        }

        int[] charactersArray = new int[10];


        for (i = 0; i<10; i++) {
            charactersArray[i] = i+1;
        }

        for (i = 0; i<charactersArray.length; i++) {

            System.out.println(charactersArray[2]);
        }

        int p = 10;
        p += 5;
        p = p + 5;

        int result = 5>4 ? 10 : 4;
        System.out.println(result);

    }
}


