public class Laptop {
    private static int instanceCount = 0;
            private int id;
            private String brand;
            private String model;
            private String processor;
            private int ramSize;
            private String storageType;
            private double screenSize;
            private double batteryLife;
            private double price;

            public Laptop(String brand, String model, String processor, int ramSize,
                    String storageType, double screenSize, double batteryLife, double price) {
                this.id = ++instanceCount;
                this.brand = brand;
                this.model = model;
                this.processor = processor;
                this.ramSize = ramSize;
                this.storageType = storageType;
                this.screenSize = screenSize;
                this.batteryLife = batteryLife;
                this.price = price;

                System.out.println("Created Laptop #" + id + " - " + brand + " " + model);
            }

            public void boot() {
            }

            public void runSoftware() {
                // Placeholder for run software logic
            }

            public void connectToWiFi() {
            }
}
