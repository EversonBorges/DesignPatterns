package AbstractFactory.factories;

import AbstractFactory.buttons.Button;
import AbstractFactory.buttons.LinuxOsButton;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.checkboxes.LinuxOsCheckbox;

public class LinuxOSFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new LinuxOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxOsCheckbox();
    }
}
