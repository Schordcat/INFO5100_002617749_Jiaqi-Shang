// Singleton Pattern - DatabaseConnectionManager
public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance = new DatabaseConnectionManager();

    private DatabaseConnectionManager() {}

    public static DatabaseConnectionManager getInstance() {
        return instance;
    }

    public void connect() {
        System.out.println("Database Connection Established");
    }
}