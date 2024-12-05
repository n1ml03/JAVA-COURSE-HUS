package com.oop.collections.mylist;

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
        if (size >= elements.length - 1) {
            enlarge();
        }
        try {
            checkBoundaries(index, size);
            if (size - index >= 0)
                System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = o;
            size++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't add " + o + " at index " + index);
        }

    }

    @Override
    public void remove(int index) {
        try {
            checkBoundaries(index, size - 1);
            if (size - 1 - index >= 0)
                System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
            size--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't remove object at index " + index);
        }

    }

    @Override
    public Object get(int index) {
        try {
            checkBoundaries(index, size - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't get object at index " + index);
            return null;
        }
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
