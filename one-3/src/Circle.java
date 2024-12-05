class Circle extends Shape {
    private double x, y, radius;

    public Circle(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double percentage) {
        radius *= (1 + percentage / 100.0);
    }
}

class Rectangle extends Shape {
    private double x, y, width, height;

    public Rectangle(double x, double y, double width, double height, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        drawingAPI.drawRectangle(x, y, width, height);
    }

    @Override
    public void resizeByPercentage(double percentage) {
        width *= (1 + percentage / 100.0);
        height *= (1 + percentage / 100.0);
    }
}