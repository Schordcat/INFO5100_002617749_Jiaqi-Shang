public class Smartphone {
private static int instanceCount = 0;
private int id;
private String brand;
private String model;
private String color;
private double screenSize;
private int batteryCapacity;
private int storageCapacity;
private String operatingSystem;
private double price;

public Smartphone(String brand, String model, String color, double screenSize,
                  int batteryCapacity, int storageCapacity, String operatingSystem,
                  double price) {
    boolean isSmartphone = true;
    if (!isSmartphone) {
        throw new IllegalArgumentException("Invalid argument: isSmartphone must be true");
    }
    this.id = ++instanceCount;
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.screenSize = screenSize;
    this.batteryCapacity = batteryCapacity;
    this.storageCapacity = storageCapacity;
    this.operatingSystem = operatingSystem;
    this.price = price;

    System.out.println("Created Smartphone #" + id + " - " + brand + " " + model+ " " + color + " " + screenSize + " " + batteryCapacity + " " + storageCapacity + " " + operatingSystem + " " + price);
}

public void powerOn() {
}

public void makeCall() {
}
 public class Camera {
    private int megapixels;
    private boolean hasFlash;

    public void Camera(int megapixels, boolean hasFlash) {
        this.megapixels = megapixels;
        this.hasFlash = hasFlash;
    }

    public void takePhoto() {
    }

    public void recordVideo() {
    }
}

public class Screen {
    private int resolution;
    private boolean isTouchscreen;

    public Screen(int resolution, boolean isTouchscreen) {
        this.resolution = resolution;
        this.isTouchscreen = isTouchscreen;
    }

    public void displayImage() {
    }

    public void displayVideo() {
    }
    
}
}