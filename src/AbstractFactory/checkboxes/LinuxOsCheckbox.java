package AbstractFactory.checkboxes;

public class LinuxOsCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Criando LinuxOsCheckbox");
    }
}
