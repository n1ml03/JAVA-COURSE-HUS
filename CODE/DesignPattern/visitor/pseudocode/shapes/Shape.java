package com.visitor.pseudocode.shapes;

import com.visitor.pseudocode.visitor.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
