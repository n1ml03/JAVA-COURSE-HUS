package com.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Attempting to create first database connection...");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();
        db1.executeQuery("SELECT * FROM users");
        
        System.out.println("\nAttempting to create second database connection...");
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        // This will show that db2 is the same instance as db1
        db2.executeQuery("SELECT * FROM products");
        
        // Verify both variables reference the same instance
        System.out.println("\nVerifying singleton behavior:");
        System.out.println("db1 instance: " + db1.hashCode());
        System.out.println("db2 instance: " + db2.hashCode());
        System.out.println("Are db1 and db2 the same instance? " + (db1 == db2));
        
        // Cleanup
        db1.disconnect();
    }
}