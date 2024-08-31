package AbstractFactory.app;

import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.factories.GuiFactory;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GuiFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }

    public void size(){
        button.size();
    }
}
