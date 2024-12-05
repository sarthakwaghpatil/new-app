package prc;

public class SingletonDemo {
    public static void main(String[] args) {
        // Simulate multiple threads trying to access the Singleton
        Runnable task = () -> {
            DatabaseConnection connection = DatabaseConnection.getConnection();
            connection.connect();
        };

        // Create and start multiple threads
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
