public class Television {
    private static int instanceCount = 0;
    private int id;
    private String brand;
    private String model;
    private int screenSize;
    private String displayType;
    private int resolution;
    private boolean smartTV;
    private int numHdmiPorts;
    private double price;

    public Television(String brand, String model, int screenSize, String displayType,
            int resolution, boolean smartTV, int numHdmiPorts, double price) {
        this.id = ++instanceCount;
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.displayType = displayType;
        this.resolution = resolution;
        this.smartTV = smartTV;
        this.numHdmiPorts = numHdmiPorts;
        this.price = price;

        System.out.println("Created Television #" + id + " - " + brand + " " + model+ " " + screenSize + " " + displayType + " " + resolution + " " + smartTV + " " + numHdmiPorts + " " + price);
    }

    public void turnOn() {
    }

    public void changeChannel() {
    }

    public void adjustVolume() {
    }
}
