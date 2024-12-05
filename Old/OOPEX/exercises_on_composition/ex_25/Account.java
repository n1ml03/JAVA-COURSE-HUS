package exercises_on_composition.ex_25;

public class Account {
    private int id;
    private Customer2 customer2;
    private double balance = 0.0;

    public Account(int id, Customer2 customer2, double balance) {
        this.id = id;
        this.customer2 = customer2;
        this.balance = balance;
    }

    public Account(int id, Customer2 customer2) {
        this.id = id;
        this.customer2 = customer2;
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer2() {
        return customer2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer2.toString() + "balance=" + (double) Math.round(balance * 100.0) / 100.0;
    }

    public String getCustomerName() {
        return customer2.getName();
    }

//    public Account deposit(double amount) {
//        balance += amount;
//        return null;
//    }

//    public Account withdraw(double amount) {
//        if(balance >= amount) {
//            balance -= amount;
//        } else {
//            System.out.println("amount withdraw exceeds the current balance!");
//
//        }
//        return null;
//    }
}
