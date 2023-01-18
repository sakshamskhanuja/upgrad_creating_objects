public class Main {
    public static void main(String[] args) {
        // Initializing an object of type Circle.
        Circle c1 = new Circle();

        // Setting radius for object c1.
        c1.radius = 10F;
        System.out.println("Area of c1 Circle = " + c1.getArea());

        // Initializing an object of type Circle.
        Circle c2 = new Circle();

        // Setting radius for object c2.
        c2.radius = 20F;
        System.out.println("Area of c2 Circle = " + c2.getArea());
    }
}

/**
 * Stores the radius of a circle and calculate its area.
 */
class Circle {

    /**
     * Stores the radius of the circle.
     */
    public float radius;

    /**
     * Calculates the area of a circle.
     */
    public float getArea() {
        return 3.141F * radius * radius;
    }
}