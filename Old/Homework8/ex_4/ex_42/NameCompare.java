package ex_4.ex_42;

import java.util.Comparator;

class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }
}
