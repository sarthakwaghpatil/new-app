package prc;

public class DatabaseConnection {
    // Step 1: Create a private static variable to hold the single instance
    private static DatabaseConnection instance;

    // Step 2: Make the constructor private to prevent instantiation
    private DatabaseConnection() {
        System.out.println("DatabaseConnection instance created!");
    }

    // Step 3: Provide a public static method to get the instance with thread-safety
    public static synchronized DatabaseConnection getConnection() {
        if (instance == null) {
            instance = new DatabaseConnection(); // Create the instance if it doesn't exist
        }
        return instance;
    }

    // Simulate a method that uses the connection
    public void connect() {
        System.out.println("Connecting to the database...");
    }
}