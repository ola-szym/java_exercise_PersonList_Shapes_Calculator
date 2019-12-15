import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        write("Wprowadź pierwsza liczbę");
        int a = scanner.nextInt();
        write("Wprowadź drugą liczbę");
        int b = scanner.nextInt();

        int result = add(a, b);
        write("Wynik dodawania to " + result);
    }

    // drugi sposób
    static int add(int a, int b) {
        return a + b;
    }

    static void write(String text) {
        System.out.println(text);
    }


}
