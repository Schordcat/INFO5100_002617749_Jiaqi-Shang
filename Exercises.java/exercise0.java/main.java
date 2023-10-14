public class main {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Apple", "iPhone 12", "Blue", 6.1, 2815, 64, "iOS", 799.99);
        Smartphone smartphone2 = new Smartphone("Samsung", "Galaxy S21", "Phantom Black", 6.2, 4000, 128,
                "Android", 799.99);
        Smartphone smartphone3 = new Smartphone("Google", "Pixel 5", "Just Black", 6.0, 4080, 128,
                "Android", 699.99);

        Laptop laptop1 = new Laptop("Apple", "MacBook Pro", "Intel Core i7", 16, "SSD", 16.0, 10.0,
                1999.99);
        Laptop laptop2 = new Laptop("Dell", "XPS 13", "Intel Core i5", 8, "SSD", 13.4, 8.0, 1199.99);
        Laptop laptop3 = new Laptop("HP", "Spectre x360", "Intel Core i7", 16, "SSD", 13.3, 12.0, 1399.99);

        DeskChair deskChair1 = new DeskChair("Mesh", "Black", true, true, true, true, "Memory Foam",
                199.99);
        DeskChair deskChair2 = new DeskChair("Leather", "Brown", true, true, false, true, "Foam", 149.99);
        DeskChair deskChair3 = new DeskChair("Fabric", "Gray", true, false, true, false, "Memory Foam",
                99.99);

        CoffeeMug coffeeMug1 = new CoffeeMug("Ceramic", "White", 12, true, true, "Plain", "Round", 9.99);
        CoffeeMug coffeeMug2 = new CoffeeMug("Glass", "Clear", 16, false, false, "Patterned", "Curved",
                7.99);
        CoffeeMug coffeeMug3 = new CoffeeMug("Stainless Steel", "Silver", 20, true, true, "Insulated",
                "Tapered", 14.99);

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "Classic", 281, 1960, "9780446310789",
                "Paperback", 8.99);
        Book book2 = new Book("1984", "George Orwell", "Dystopian", 328, 1949, "9780451524935", "Paperback",
                9.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 180, 1925,
                "9780743273565", "Paperback", 7.99);

        House house1 = new House("123 Main St", 3, 2, 1500, true, 0.25, 1990, 299999.99);
        House house2 = new House("456 Oak Ave", 4, 3, 2500, true, 0.5, 2005, 499999.99);
        House house3 = new House("789 Maple Blvd", 2, 1, 1000, false, 0.1, 1950, 199999.99);

        Car car1 = new Car("Toyota", "Camry", 2021, "Silver", "Gasoline", 0, 30.0, 24999.99);
        Car car2 = new Car("Honda", "Civic", 2021, "White", "Gasoline", 0, 35.0, 21999.99);
        Car car3 = new Car("Ford", "Mustang", 2021, "Red", "Gasoline", 0, 25.0, 34999.99);

        Television television1 = new Television("LG", "OLED65CXPUA", 65, "OLED", 4_096_000, true, 4,
                1999.99);
        Television television2 = new Television("Samsung", "QN65Q80TAFXZA", 65, "QLED", 3_840_000, true, 4,
                1499.99);
        Television television3 = new Television("Sony", "XBR65X900H", 65, "LED", 3_840_000, true, 4,
                1399.99);

        Toaster toaster1 = new Toaster("Cuisinart", "CPT-180P1", 2, 6, true, 69.99, false);
        Toaster toaster2 = new Toaster("Hamilton Beach", "31344D", 4, 7, true, 39.99, true);
        Toaster toaster3 = new Toaster("Black+Decker", "TR3500SD", 2, 7, true, 49.99, false);

        Blender blender1 = new Blender("Brand1", "Model1", 1000, 5, "Glass", 50.0);
        Blender blender2 = new Blender("Brand2", "Model2", 1500, 7, "Plastic", 40.0);
        Blender blender3 = new Blender("Brand3", "Model3", 1200, 6, "Stainless Steel", 60.0);
    }
}
