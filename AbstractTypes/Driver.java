package AbstractTypes;// AbstractTypes.Driver.java
// Isaiah Stuffle

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // Create two AbstractTypes.Shape objects
        Shape circle1 = new Circle("red", false, 5.0);
        Shape rectangle1 = new Rectangle("blue", true, 10.0, 5.0);
        Shape rectangle2 = new Rectangle("green", true, 3.5, 4.0);

        // Display the shapes
        // System.out.println(circle1);
        System.out.print(rectangle1);
        System.out.println("\tArea: " + rectangle1.getArea() + "\n");

        System.out.print(rectangle2);
        System.out.println("\tArea: " + rectangle2.getArea() + "\n");

        System.out.println("Are the shapes equal? \n\t" + equalArea(rectangle1, rectangle2));
    }

    // The equal area method
    public static boolean equalArea(Shape shape1,Shape shape2){
        return shape1.getArea() == shape2.getArea();
    }
}
