import java.io.*;

class Triangle extends Shape implements Serializable {
    double base;
    double height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        // For simplicity, let's assume it's an equilateral triangle
        return 3 * base;
    }
}
