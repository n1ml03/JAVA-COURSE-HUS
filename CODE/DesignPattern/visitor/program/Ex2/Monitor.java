package com.visitor.program.Ex2;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
