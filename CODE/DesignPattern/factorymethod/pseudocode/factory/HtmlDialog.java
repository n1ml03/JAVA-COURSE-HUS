package com.factorymethod.pseudocode.factory;

import com.factorymethod.pseudocode.buttons.Button;
import com.factorymethod.pseudocode.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
