package FactoryMethod.factoryDocuments;

import FactoryMethod.factoryDocuments.factory.DocumentCreator;
import FactoryMethod.factoryDocuments.factory.PDFDocumentCreator;
import FactoryMethod.factoryDocuments.factory.WordDocumentCreator;

public class Demo {

    public static void main(String[] args) {
        DocumentCreator creator;

        creator = new WordDocumentCreator();
        creator.openDocument();

        creator = new PDFDocumentCreator();
        creator.openDocument();

    }
}
