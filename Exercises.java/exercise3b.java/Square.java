import java.io.Serializable;

class Square extends Shape implements Serializable {
    double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}