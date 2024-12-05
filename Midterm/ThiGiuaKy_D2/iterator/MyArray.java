package com.iterator;

import java.util.Arrays;

public class MyArray implements MyIterable {
	private int numberOfItems;
	private String[] menuItems;

	public MyArray() {
		this(6); // Sử dụng constructor có tham số để khởi tạo mảng với kích thước mặc định
	}

	public MyArray(int initialCapacity) { // Thêm constructor với tham số để tùy chỉnh kích thước ban đầu
		numberOfItems = 0;
		menuItems = new String[initialCapacity];
	}


	public void addItem(String name) {
		if (numberOfItems == menuItems.length) {
			// Tăng kích thước mảng lên gấp đôi + 1 để tránh tăng kích thước liên tục
			menuItems = Arrays.copyOf(menuItems, numberOfItems * 2 + 1); 
		}
		menuItems[numberOfItems++] = name;
	}

	public String[] getMenuItems() {
		// Trả về một bản sao của mảng để tránh sửa đổi trực tiếp mảng bên trong
		return Arrays.copyOf(menuItems, numberOfItems); 
	}

	public Iterator createIterator() {
		return new MyArrayIterator(menuItems, numberOfItems); // Truyền thêm numberOfItems để iterator chỉ duyệt qua các phần tử đã được sử dụng
	}

	public String toString() {
		return "My Array Structure[menuItems=" + Arrays.toString(menuItems) + ']'; // Sử dụng Arrays.toString() cho output rõ ràng hơn
	}
}
