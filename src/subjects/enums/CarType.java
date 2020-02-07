package subjects.enums;

public enum CarType {
    PASSENGER,
    SUPPLY;

    public static CarType fromValue(int value) {
        if (value == 3) {
            return CarType.PASSENGER;
        } else if (value == 4) {
            return CarType.SUPPLY;
        } else {
            throw new IllegalArgumentException("Wrong value " + value);
        }

    }
}

