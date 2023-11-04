public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(4, 3, "Red");
        Shape rectangle = new Rectangle(4, 5, "Blue");
        Shape circle = new Circle(3, "Green");
        Shape square = new Square(4, "Yellow");
        printShapeInfo(triangle);
        printShapeInfo(rectangle);
        printShapeInfo(circle);
        printShapeInfo(square);
    }

    public static void printShapeInfo(Shape shape) {
        System.out.println("Shape color: " + shape.color);
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("----------------------");
    }
}
