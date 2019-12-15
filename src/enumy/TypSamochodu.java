package enumy;

public enum TypSamochodu {
    OSOBOWY,
    DOSTAWCZY;

    public static TypSamochodu fromValue(int value) {
        if (value == 3) {
            return TypSamochodu.OSOBOWY;
        } else if (value == 4) {
            return TypSamochodu.DOSTAWCZY;
        } else {
            throw new IllegalArgumentException("Nieprawidlowa wartosc " + value);
        }

    }
}

