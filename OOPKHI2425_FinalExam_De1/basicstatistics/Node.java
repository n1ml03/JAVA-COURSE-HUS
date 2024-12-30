package hus.oop.basicstatistics;

public class Node {
    public Number payload;
    public Node next;

    public Node(Number payload) {
        /* TODO */
        this(payload, null);
    }

    public Node(Number payload, Node next) {
        /* TODO */
        this.payload = payload;
        this.next = next;
    }
}
