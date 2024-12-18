class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing Circle using API1 at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        System.out.println("Drawing Rectangle using API1 at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}

class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Drawing Circle using API2 at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void drawRectangle(double x, double y, double width, double height) {
        System.out.println("Drawing Rectangle using API2 at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}