import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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

        // Serialization
        serializeObject("triangle.ser", triangle);
        serializeObject("rectangle.ser", rectangle);
        serializeObject("circle.ser", circle);
        serializeObject("square.ser", square);

        // Deserialization
        Shape deserializedTriangle = (Shape) deserializeObject("triangle.ser");
        Shape deserializedRectangle = (Shape) deserializeObject("rectangle.ser");
        Shape deserializedCircle = (Shape) deserializeObject("circle.ser");
        Shape deserializedSquare = (Shape) deserializeObject("square.ser");

        printShapeInfo(deserializedTriangle);
        printShapeInfo(deserializedRectangle);
        printShapeInfo(deserializedCircle);
        printShapeInfo(deserializedSquare);
    }

    public static void printShapeInfo(Shape shape) {
        System.out.println("Shape color: " + shape.color);
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("----------------------");
    }

    public static void serializeObject(String fileName, Object object) {
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    public static Object deserializeObject(String fileName) {
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
            Object object = in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized");
            return object;
        } catch (IOException ex) {
            System.out.println("IOException is caught");
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
            return null;
        }
    }
}