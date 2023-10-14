public class Car {
    private static int instanceCount = 0;
                private int id;
                private String make;
                private String model;
                private int year;
                private String color;
                private String engineType;
                private int mileage;
                private double fuelEfficiency;
                private double price;

                public Car(String make, String model, int year, String color, String engineType,
                        int mileage, double fuelEfficiency, double price) {
                    this.id = ++instanceCount;
                    this.make = make;
                    this.model = model;
                    this.year = year;
                    this.color = color;
                    this.engineType = engineType;
                    this.mileage = mileage;
                    this.fuelEfficiency = fuelEfficiency;
                    this.price = price;

                    System.out.println("Created Car #" + id + " - " + make + " " + model+ " " + year+ " " + color+ " " + engineType+ " " + mileage+ " " + fuelEfficiency+ " " + price);
                }

                public void startEngine() {
                }

                public void accelerate() {
                }

                public void brake() {
                }
}
