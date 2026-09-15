package AbstractTypes;// AbstractTypes.Shape.java
// Isaiah Stuffle

// This is an abstract class called AbstractTypes.Shape
public abstract class Shape {
    // Private data members
    private String color = "white";
    private boolean filled = false;

    // The Constructor
    protected Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // The abstract get area method
    public abstract double getArea();

    // The toString method
    @Override
    public String toString() {
        return "\tColor: " + this.color + "\n" +
                "\tFilled: " + this.filled + "\n";
    }
}
