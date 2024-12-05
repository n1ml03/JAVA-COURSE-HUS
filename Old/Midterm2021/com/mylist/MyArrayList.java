package com.mylist;

public class MyArrayList extends MyAbstractList {
    static final int DEFAULT_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        if (size == elements.length) {
            enlarge();
        }
        checkBoundaries(index, size);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
