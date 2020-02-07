package person;

class Adress implements Printable {
    private String streetName;
    private String townName;

    Adress(String streetName, String townName) {
        this.streetName = streetName;
        this.townName = townName;
    }

    public void print() {
        System.out.println("Your street: " + this.streetName);
        System.out.println("Your town: " + this.townName);
    }

}
