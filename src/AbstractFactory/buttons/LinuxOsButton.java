package AbstractFactory.buttons;

public class LinuxOsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Criando LinuxOsButton");
    }

    @Override
    public void size() {
        System.out.println("Size 10 LinuxOsButton");
    }
}
