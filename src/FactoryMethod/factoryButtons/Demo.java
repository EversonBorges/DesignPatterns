package FactoryMethod.factoryButtons;

import FactoryMethod.factoryButtons.factory.Dialog;
import FactoryMethod.factoryButtons.factory.HtmlDialog;
import FactoryMethod.factoryButtons.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure(){
        dialog = System.getProperty("os.name").equals("Linux")
                ? new WindowsDialog()
                : new HtmlDialog();
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
