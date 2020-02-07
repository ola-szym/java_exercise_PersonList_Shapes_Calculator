package shapes;

public enum ShapeType {
    TRIANGLE("triangle", 3),
    CIRCLE("circle", 0),
    SQUARE("square", 4),
    RECTANGLE("rectangle", 4);

    private String name;
    private int sidesNumber;

    ShapeType(String name, int sidesNumber){
        this.name = name;
        this.sidesNumber = sidesNumber;
    }

    public String getName() {
        return name;
    }

    public int getSidesNumber() {
        return sidesNumber;
    }
}
