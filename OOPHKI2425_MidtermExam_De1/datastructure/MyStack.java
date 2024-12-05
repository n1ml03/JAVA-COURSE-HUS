package hus.oop.datastructure;

public class MyStack {
    private MyList stackData;

    public MyStack() {
        this.stackData = new MyLinkedList();
    }

    /**
     * Thêm dữ liệu vào đầu stack.
     * @param value
     */
    public void push(int value) {
        stackData.insertAtStart(value);
    }

    /**
     * Trả lại giá trị ở vị trí đầu stack và xóa luôn phần tử dữ liệu đó.
     * @return
     */
    public int pop() {
        int value = stackData.get(0);
        stackData.remove(0);
        return value;
    }

    /**
     * Kiểm tra xem stack có rỗng không.
     * @return true nếu stack rỗng, false nếu stack không rỗng.
     */
    public boolean isEmpty() {
        return stackData.size() == 0;
    }

    /**
     * Trả lại giá trị ở đầu stack mà không xóa phần tử dữ liệu.
     * @return giá trị ở vị trí đầu stack.
     */
    public int peek() {
        return stackData.get(0);
    }

    /**
     * Lấy kích thước của stack.
     * @return
     */
    public int size() {
        return stackData.size();
    }
}
