package shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0,0), 1, Color.BLACK);
        Triangle triangle = new Triangle(Color.RED, new Point(0, 0), new Point(1, 0), new Point(0, 1));
        Square square = new Square(new Point(0,0), 2, Color.PURPLE);

        Shape[] shapes = new Shape[] {circle,triangle,square};
        printShapeElements(shapes);
    }

    private static void printShapeElements(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(1 + "). " + objects.toString());
        }
    }
    private static Shape findShapeWithMaxArea(Shape[] shapes) {
        Shape maxShape = null;
        double maxArea = Double.NEGATIVE_INFINITY;
        for (Shape shape : shapes) {
            double area = shape.getArea();
            if (area > maxArea) {
                maxArea = area;
                maxShape = shape;
            }
        }
        return maxShape;
    }

}



