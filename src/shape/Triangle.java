package shape;

public class Triangle extends Shape{
    private final Point firstPoint;
    private final Point secondPoint;
    private final Point thirdPoint;

    public Triangle(Color color, Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(color);
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    @Override
    public double getArea() {
        return Math.abs((firstPoint.getX() - thirdPoint.getX()) * (secondPoint.getY() - thirdPoint.getY())
                - (secondPoint.getX() - thirdPoint.getX()) * (firstPoint.getY() - thirdPoint.getY())) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + color +
                ", firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                '}';
    }
}
