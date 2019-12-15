public enum ShapeType {
    TRIANGLE("triangle", 3),
    CIRCLE("circle", 0),
    SQUARE("square", 4),
    RECTANGLE("rectangle", 4);

    private String name;
    private int iloscBokow;

    ShapeType(String name, int iloscBokow){
        this.name = name;
        this.iloscBokow = iloscBokow;
    }

    public String getName() {
        return name;
    }

    public int getIloscBokow() {
        return iloscBokow;
    }
}
