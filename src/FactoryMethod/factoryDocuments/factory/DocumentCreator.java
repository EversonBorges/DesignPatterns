package FactoryMethod.factoryDocuments.factory;

import FactoryMethod.factoryDocuments.documents.Document;

public abstract class DocumentCreator {
    //Factory Method
    public abstract Document createDocument();

    public void openDocument(){
        Document document = createDocument();
        document.open();
    }
}
