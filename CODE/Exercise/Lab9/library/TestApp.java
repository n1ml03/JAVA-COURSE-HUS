package com.oop.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestApp {
    public static void main(String[] args) throws ParseException {
        // Khởi tạo các đối tượng Item
        Item i1 = new Book("Soffocare", 2002, 170);
        Item i2 = new Dvd("Moon", 2011, 130);

        // Khởi tạo các đối tượng Student
        Student s1 = new Student("0001", "Darrell", "Abbott");
        Student s2 = new Student("0002", "Nick", "Drake");

        // Khởi tạo SimpleDateFormat để phân tích chuỗi ngày tháng
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        // Khởi tạo mảng Rent
        Rent[] rents = new Rent[] {
                new Rent(i1, s1, sdf.parse("15/06/2020"), sdf.parse("15/07/2020")),
                new Rent(i1, s2, sdf.parse("10/07/2020"), sdf.parse("20/07/2020")),
                new Rent(i1, s1, sdf.parse("25/08/2020"), sdf.parse("14/11/2020")),
                new Rent(i2, s2, sdf.parse("10/07/2020"), sdf.parse("20/07/2020")),
                new Rent(i2, s1, sdf.parse("25/08/2020"), sdf.parse("28/08/2020"))
        };

        // Khởi tạo đối tượng Library và in ra kết quả
        Library l = new Library(rents);
        System.out.println(l.getLongestRent());
    }
}
