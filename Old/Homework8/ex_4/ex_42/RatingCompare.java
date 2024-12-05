package ex_4.ex_42;

import java.util.Comparator;

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return Double.compare(left.getRating(), right.getRating());
    }
}
