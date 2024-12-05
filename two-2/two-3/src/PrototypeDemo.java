// Main class to demonstrate the Prototype Pattern
public class PrototypeDemo {
    public static void main(String[] args) {
        // Create original Circle and Rectangle
        Circle originalCircle = new Circle(5);
        Rectangle originalRectangle = new Rectangle(10, 20);

        // Clone the Circle
        Circle clonedCircle = (Circle) originalCircle.clone();
        clonedCircle.setRadius(7); // Modify the cloned Circle

        // Clone the Rectangle
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        clonedRectangle.setWidth(15); // Modify the cloned Rectangle

        // Display original and cloned shapes
        System.out.println("Original Circle:");
        originalCircle.draw();

        System.out.println("Cloned Circle:");
        clonedCircle.draw();

        System.out.println("Original Rectangle:");
        originalRectangle.draw();

        System.out.println("Cloned Rectangle:");
        clonedRectangle.draw();
    }
}
