package AbstractTypes;
// AbstractTypes.Circle.java
// Isaiah Stuffle

public class Circle extends Shape {
    private double radius;

    // Constructor
    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle \n" +
                super.toString() +
                "\tRadius: " + this.radius + "\n";
    }
}
