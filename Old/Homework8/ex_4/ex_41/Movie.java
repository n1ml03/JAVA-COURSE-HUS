package ex_4.ex_41;

import java.util.*;
import java.io.*;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {

    }

    public int compareTo(Movie movie) {
        Integer movie1 = Integer.valueOf(this.getYear());
        Integer movie2 = Integer.valueOf(movie.getYear());
        return movie1.compareTo(movie2);
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}


