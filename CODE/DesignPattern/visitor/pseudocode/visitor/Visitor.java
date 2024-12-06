package com.visitor.pseudocode.visitor;

import com.visitor.pseudocode.shapes.Circle;
import com.visitor.pseudocode.shapes.CompoundShape;
import com.visitor.pseudocode.shapes.Dot;
import com.visitor.pseudocode.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
