public class DeskChair {
    private static int instanceCount = 0;
            private int id;
            private String material;
            private String color;
            private boolean adjustableHeight;
            private boolean armrests;
            private boolean lumbarSupport;
            private boolean swivel;
            private String cushioning;
            private double price;

            public DeskChair(String material, String color, boolean adjustableHeight,
                    boolean armrests, boolean lumbarSupport, boolean swivel,
                    String cushioning, double price) {
                this.id = ++instanceCount;
                this.material = material;
                this.color = color;
                this.adjustableHeight = adjustableHeight;
                this.armrests = armrests;
                this.lumbarSupport = lumbarSupport;
                this.swivel = swivel;
                this.cushioning = cushioning;
                this.price = price;

                System.out.println("Created Desk Chair #" + id + " - " + color + " " + material + " Chair");
            }

            public void adjustHeight() {
                // Placeholder for adjust height logic
            }

            public void rotate() {
                // Placeholder for rotate logic
            }

            public void sitDown() {
                // Placeholder for sit down logic
            }
}
