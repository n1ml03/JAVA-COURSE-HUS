package exercises_on_composition.ex_22;

import exercises_on_composition.ex_21.Author;

import java.util.Arrays;

public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book2(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;

    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book2 [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty
                + "]";
    }

    public String getAuthorNames() {
        return authors[0].getName() + "," + authors[1].getName();
    }
}
