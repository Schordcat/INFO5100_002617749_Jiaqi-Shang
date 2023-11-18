import java.io.*;

public abstract class Shape implements Serializable {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}