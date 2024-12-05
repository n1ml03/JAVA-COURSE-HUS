package com.adapter;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        if (this.getRadius() >= peg.getRadius()) {
            return true;
        }
        return false;
    }
}
