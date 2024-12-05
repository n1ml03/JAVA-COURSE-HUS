package com.singleton;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM K66A5");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM K66A4");

        System.out.println(bar == foo);
    }
}
