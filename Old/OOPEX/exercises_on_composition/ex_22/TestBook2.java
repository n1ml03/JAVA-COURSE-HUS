package exercises_on_composition.ex_22;

import exercises_on_composition.ex_21.Author;


public class TestBook2 {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@nowhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
