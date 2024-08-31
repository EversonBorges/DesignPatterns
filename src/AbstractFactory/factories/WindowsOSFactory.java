package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.buttons.WindowsOsButton;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.checkboxes.WindowsOsCheckbox;

public class WindowsOSFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsOsCheckbox();
    }
}
