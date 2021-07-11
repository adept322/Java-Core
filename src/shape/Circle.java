package shape;

public class Circle extends Shape {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius, Color color) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public double getArea() {
        return radius * radius  * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color=" + color +
                '}';
    }
}
