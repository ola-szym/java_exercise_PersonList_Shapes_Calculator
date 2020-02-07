package person;

// public
// package-private
// protected
// private

class Person implements Printable {

    private String firstName;
    private String lastName;
    private int age;
    private Adress adress;

    String pesel;
    String gender;


    Person(String firstName, String lastName, int age, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.adress = adress;
    }

    public static void main(String[] args) {
        Person p1 = new Person("imie1", "nazwisko1", 5, null);
        Person p2 = new Person("imie2", "nazwisko2", 55, null);
        System.out.println("The end");
    }

    public void print() {

        System.out.println("Your name: " + this.firstName);
        System.out.println("Your surname: " + this.lastName);
        System.out.println("Your age: " + this.age);
        this.adress.print();

        Printable p = new Adress("asd", "sda");
        p.print();

        Printable s = new Person("sdsd", "fhdh", 25, null);
        s.print();
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age;
    }
}
