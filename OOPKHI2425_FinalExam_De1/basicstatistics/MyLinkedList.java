package hus.oop.basicstatistics;

import java.util.NoSuchElementException;

public class MyLinkedList extends MyAbstractList {
    private Node head;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.head = null;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        int count = 0;
        Node currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Number get(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        return getNodeByIndex(index).payload;
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node prevNode = getNodeByIndex(index - 1);
            prevNode.next = prevNode.next.next;
        }
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Number payload) {
        /* TODO */
        Node newNode = new Node(payload);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Number payload, int index) {
        /* TODO */
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        Node newNode = new Node(payload);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prevNode = getNodeByIndex(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(0);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    private class MyLinkedListIterator implements MyIterator {
        /*
         * Vị trí hiện tại của iterator trong list.
         */
        private Node currentNode;

        /**
         * Khởi tạo cho iterator ở vị trí position trong MyLinkedList.
         * @param position
         */
        public MyLinkedListIterator(int position) {
            /* TODO */
            if (position == 0) {
                currentNode = head;
            } else {
                currentNode = getNodeByIndex(position);
            }
        }

        /**
         * Kiểm tra trong MyLinkedList có còn phần tử không.
         * Nếu còn thì trả về true, nếu không còn thì trả về false.
         * @return
         */
        @Override
        public boolean hasNext() {
            /* TODO */
            return currentNode != null;
        }

        /**
         * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
         * @return payload của phần tử hiện tại.
         */
        @Override
        public Number next() {
            /* TODO */
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Number payload = currentNode.payload;
            currentNode = currentNode.next;
            return payload;
        }

        @Override
        public void remove() {
            /* TODO */
        }
    }

    private class Node {
        Number payload;
        Node next;

        public Node(Number payload) {
            this.payload = payload;
        }
    }
}
