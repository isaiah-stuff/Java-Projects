package AbstractTypes;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle \n" +
                super.toString() +
                "\tLength: " + this.length + "\n" +
                "\tWidth: " + this.width + "\n";
    }
}
