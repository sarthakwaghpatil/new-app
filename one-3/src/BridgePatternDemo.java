public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape circle1 = new Circle(1, 2, 3, new DrawingAPI1());
        Shape circle2 = new Circle(5, 7, 11, new DrawingAPI2());

        Shape rectangle1 = new Rectangle(0, 0, 4, 6, new DrawingAPI1());
        Shape rectangle2 = new Rectangle(3, 4, 8, 10, new DrawingAPI2());

        // Draw shapes with different APIs
        circle1.draw();
        circle2.draw();

        rectangle1.draw();
        rectangle2.draw();

        // Resize and redraw shapes
        circle1.resizeByPercentage(50);
        rectangle2.resizeByPercentage(20);

        System.out.println("\nAfter resizing:");
        circle1.draw();
        rectangle2.draw();
    }
}