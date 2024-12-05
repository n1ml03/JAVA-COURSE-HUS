package com.singleton;

public final class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionUrl;
    private boolean isConnected;
    
    // Private constructor to prevent direct instantiation
    private DatabaseConnection() {
        this.connectionUrl = "jdbc:mysql://localhost:3306/mydb";
        this.isConnected = false;
    }
    
    // Public static method to get the singleton instance
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    // Business logic methods
    public void connect() {
        if (!isConnected) {
            System.out.println("Connecting to database at " + connectionUrl);
            // Simulating database connection
            isConnected = true;
            System.out.println("Connected successfully!");
        } else {
            System.out.println("Already connected to database!");
        }
    }
    
    public void disconnect() {
        if (isConnected) {
            System.out.println("Disconnecting from database...");
            // Simulating database disconnection
            isConnected = false;
            System.out.println("Disconnected successfully!");
        } else {
            System.out.println("Already disconnected!");
        }
    }
    
    public void executeQuery(String query) {
        if (isConnected) {
            System.out.println("Executing query: " + query);
            // Simulating query execution
            System.out.println("Query executed successfully!");
        } else {
            System.out.println("Not connected to database. Please connect first!");
        }
    }
    
    // Method to check connection status
    public boolean isConnected() {
        return isConnected;
    }
}