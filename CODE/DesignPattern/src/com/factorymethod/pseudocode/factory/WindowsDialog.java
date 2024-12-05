package com.factorymethod.pseudocode.factory;

import com.factorymethod.pseudocode.buttons.Button;
import com.factorymethod.pseudocode.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
