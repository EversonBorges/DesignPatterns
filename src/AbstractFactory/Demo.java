package AbstractFactory;

import AbstractFactory.app.Application;
import AbstractFactory.factories.GuiFactory;
import AbstractFactory.factories.LinuxOSFactory;
import AbstractFactory.factories.WindowsOSFactory;

public class Demo {

    private static Application configurreApplication(){
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        factory = osName.contains("linux") ? new LinuxOSFactory() : new WindowsOSFactory();

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application application = configurreApplication();
        application.paint();
        application.size();
    }
}
