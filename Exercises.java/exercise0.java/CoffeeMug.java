public class CoffeeMug {
    private static int instanceCount = 0;
                private int id;
                private String material;
                private String color;
                private int capacity;
                private boolean hasHandle;
                private boolean insulation;
                private String design;
                private String lipShape;
                private double price;

                public CoffeeMug(String material, String color, int capacity, boolean hasHandle,
                        boolean insulation, String design, String lipShape, double price) {
                    this.id = ++instanceCount;
                    this.material = material;
                    this.color = color;
                    this.capacity = capacity;
                    this.hasHandle = hasHandle;
                    this.insulation = insulation;
                    this.design = design;
                    this.lipShape = lipShape;
                    this.price = price;

                    System.out.println("Created Coffee Mug #" + id + " - " + color + " " + material + " Mug");
                }

                public void fillWithLiquid() {
                }

                public void sip() {
                }

                public void wash() {
                }
}
