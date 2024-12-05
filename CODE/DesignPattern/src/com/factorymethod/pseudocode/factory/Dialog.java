package com.factorymethod.pseudocode.factory;

import com.factorymethod.pseudocode.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
