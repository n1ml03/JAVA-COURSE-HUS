package com.iterator;

public class App {

	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		myArray.addItem("ArrayItem1");
		myArray.addItem("ArrayItem2");
		myArray.addItem("ArrayItem3");
		myArray.addItem("ArrayItem4");
		myArray.addItem("ArrayItem5");
		myArray.addItem("ArrayItem6");

		MyList myList = new MyList();
		myList.addItem("ListItem1");
		myList.addItem("ListItem2");
		myList.addItem("ListItem3");
		myList.addItem("ListItem4");
		myList.addItem("ListItem5");
		myList.addItem("ListItem6");

		// with no iterators
		System.out.println("\nITEMS with loops\n----\nARRAY");
		for (String myArrayItem : myList.getMenuItems()) {
			System.out.println(myArrayItem);
		}

		System.out.println("\nLIST");
		for (String menuItem : myArray.getMenuItems()) {
			System.out.println(menuItem);
		}

		// with iterators
		System.out.println("\nITEMS (with iterators)\n----\nARRAY");
		printItems(myArray.createIterator());
		System.out.println("\nLIST");
		printItems(myList.createIterator());
	}

	private static void printItems(Iterator iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
