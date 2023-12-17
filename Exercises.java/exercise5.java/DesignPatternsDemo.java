public class DesignPatternsDemo {
    public static void main(String[] args) {
        // Singleton usage
        DatabaseConnectionManager dbManager = DatabaseConnectionManager.getInstance();
        dbManager.connect();

        // Observer usage
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new WeatherStation());
        weatherData.setTemperature(30);

        // Factory Method usage
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
