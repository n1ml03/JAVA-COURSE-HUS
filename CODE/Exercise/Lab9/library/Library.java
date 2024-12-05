package com.oop.library;

import java.time.Period;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longestRent = rents[0];
        for (int i = 1; i < rents.length; i++) {
            if (Period.between(rents[i].begin, rents[i].end).getDays() > Period.between(longestRent.begin, longestRent.end).getDays()) {
                longestRent = rents[i];
            }
        }
        return longestRent;
    }
}
