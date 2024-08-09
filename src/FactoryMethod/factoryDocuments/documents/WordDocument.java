package FactoryMethod.factoryDocuments.documents;

public class WordDocument extends Document{

    @Override
    public void open() {
        System.out.println("Abrindo documento Word... ");
    }
}
