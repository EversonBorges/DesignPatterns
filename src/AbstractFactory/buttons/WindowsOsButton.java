package AbstractFactory.buttons;

public class WindowsOsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Criando WindowsOsButton");
    }

    @Override
    public void size() {
        System.out.println("Size 20 WindowsOsButton");
    }
}
