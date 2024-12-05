package exercises_on_composition.ex_23;

public class Book3 {
    private String isbn, name;
    private Author2 author;
    private double price;
    private int qty = 0;

    public Book3(String isbn, String name, Author2 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book3(String isbn, String name, Author2 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author2 getAuthor() {
        return author;
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

    public String getAuthorName() {
        return this.author.getName();
    }

    @Override
    public String toString() {
        return "Book3 [isbn=" + isbn + ", name=" + name + ", Author[name=" + author.getName() + ", email=" + author.getEmail() + "], price=" + price + ", qty=" + qty
                + "]";
    }


}
