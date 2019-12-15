import kalkulator.Printable;

class Adress implements Printable {
    private String streetName;
    private String townName;

   Adress(String streetName,String townName) {
       this.streetName = streetName;
       this.townName = townName;
    }

    public void print() {
        System.out.println("Twoja ulica to: " + this.streetName);
        System.out.println("Twoje miasto to: " + this.townName);
    }

    public void costam() {}
}
