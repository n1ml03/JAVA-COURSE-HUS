package exercises_on_composition.ex_23;


public class TestBook3 {
    public static void main(String[] args) {
        Author2 author2 = new Author2("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(author2);

        author2.setEmail("ahteck@somewhere.com");
        System.out.println(author2);
        System.out.println("name is: " + author2.getName());
        System.out.println("email is: " + author2.getEmail());

        Book3 book3 = new Book3("12345", "Java for dummies", author2, 8.8, 88);
        System.out.println(book3);

        book3.setPrice(9.9);
        book3.setQty(99);
        System.out.println(book3);
        System.out.println("isbn is: " + book3.getName());
        System.out.println("name is: " + book3.getName());
        System.out.println("price is: " + book3.getPrice());
        System.out.println("qty is: " + book3.getQty());
        System.out.println("author is: " + book3.getAuthor());
        System.out.println("author's name: " + book3.getAuthorName());
        System.out.println("author's name: " + book3.getAuthor().getName());
        System.out.println("author's email: " + book3.getAuthor().getEmail());
    }
}
