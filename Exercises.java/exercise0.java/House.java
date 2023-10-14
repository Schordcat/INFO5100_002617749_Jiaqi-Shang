public class House {
    private static int instanceCount = 0;
    private int id;
    private String address;
    private int numBedrooms;
    private int numBathrooms;
    private int squareFootage;
    private boolean hasGarage;
    private double yardSize;
    private int yearBuilt;
    private double price;

    public House(String address, int numBedrooms, int numBathrooms, int squareFootage,
            boolean hasGarage, double yardSize, int yearBuilt, double price) {
        this.id = ++instanceCount;
        this.address = address;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.squareFootage = squareFootage;
        this.hasGarage = hasGarage;
        this.yardSize = yardSize;
        this.yearBuilt = yearBuilt;
        this.price = price;

        System.out.println("Created House #" + id + " - " + address + " " + numBedrooms + " " + numBathrooms + " "
                + squareFootage + " " + hasGarage + " " + yardSize + " " + yearBuilt + " " + price);
    }

    public void lockDoors() {
    }

    public void turnLightsOnOff() {
    }

    public void calculatePropertyTax() {
    }
}
