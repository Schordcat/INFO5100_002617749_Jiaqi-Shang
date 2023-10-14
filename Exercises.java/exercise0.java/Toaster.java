public class Toaster {
    private static int instanceCount = 0;
    private int id;
    private String brand;
    private String model;
    private int numSlots;
    private int browningControl;
    private boolean hasCrumbTray;
    private double price;
    private boolean powerStatus;

    public Toaster(String brand, String model, int numSlots, int browningControl,
            boolean hasCrumbTray, double price, boolean powerStatus) {
        this.id = ++instanceCount;
        this.brand = brand;
        this.model = model;
        this.numSlots = numSlots;
        this.browningControl = browningControl;
        this.hasCrumbTray = hasCrumbTray;
        this.price = price;
        this.powerStatus = powerStatus;

        System.out.println("Created Toaster #" + id + " - " + brand + " " + model+ " " + numSlots+ " " + browningControl+ " " + hasCrumbTray+ " " + price+ " " + powerStatus);
    }

    public void toastBread() {
    }

    public void adjustBrowning() {
    }

    public void cleanCrumbs() {
    }
}
