package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
