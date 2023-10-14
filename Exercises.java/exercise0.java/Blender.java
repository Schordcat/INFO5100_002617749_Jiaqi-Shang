public class Blender {
    private static int instanceCount = 0;
        private int id;
        private String brand;
        private String model;
        private int powerWattage;
        private int speedControl;
        private String jarMaterial;
        private double price;

        /**
         * @param brand
         * @param model
         * @param powerWattage
         * @param speedControl
         * @param jarMaterial
         * @param price
         */
        public Blender(String brand, String model, int powerWattage, int speedControl,
                String jarMaterial, double price) {
            this.id = ++instanceCount;
            this.brand = brand;
            this.model = model;
            this.powerWattage = powerWattage;
            this.speedControl = speedControl;
            this.jarMaterial = jarMaterial;
            this.price = price;

            System.out.println("Created Blender #" + id + " - " + brand + " " + model + " " + powerWattage + " " + speedControl + " " + jarMaterial + " " + price);
        }
}
