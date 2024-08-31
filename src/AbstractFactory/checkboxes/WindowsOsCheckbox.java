package AbstractFactory.checkboxes;

public class WindowsOsCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Criando WindowsOsCheckbox");
    }
}
