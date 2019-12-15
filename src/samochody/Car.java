package samochody;


public class Car {

    private Kolor kolor;
    private Marka marka;
    private RodzajPaliwa paliwo;
    private Skrzynia skrzynia;
    private StandardWyposazenia wyposazenie;

    Car(Kolor kolor, Marka marka, RodzajPaliwa paliwo, Skrzynia skrzynia, StandardWyposazenia wyposazenie){
        this.kolor = kolor;
        this.marka = marka;
        this.paliwo = paliwo;
        this.skrzynia = skrzynia;
        this.wyposazenie = wyposazenie;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public Marka getMarka() {
        return marka;
    }

    public RodzajPaliwa getPaliwo() {
        return paliwo;
    }

    public Skrzynia getSkrzynia() {
        return skrzynia;
    }

    public StandardWyposazenia getWyposazenie() {
        return wyposazenie;
    }
}
