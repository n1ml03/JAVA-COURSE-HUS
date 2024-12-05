package com.visitor.program.Ex2;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
