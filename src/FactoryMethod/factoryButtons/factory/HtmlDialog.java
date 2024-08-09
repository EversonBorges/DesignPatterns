package FactoryMethod.factoryButtons.factory;

import FactoryMethod.factoryButtons.buttons.Button;
import FactoryMethod.factoryButtons.buttons.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
