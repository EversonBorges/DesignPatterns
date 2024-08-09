package FactoryMethod.factoryButtons.factory;

import FactoryMethod.factoryButtons.buttons.Button;
import FactoryMethod.factoryButtons.buttons.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
