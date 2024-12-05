package com.mylist;

public class TestMyList {
    public static void main(String[] args) {
        MyList l = new MyArrayList();
        l.add("a");
        l.add("b");
        l.add("c", 0);
        l.add("c", 3);
        l.remove(3);
        System.out.println(l.size());
        System.out.println(l);
    }
}
