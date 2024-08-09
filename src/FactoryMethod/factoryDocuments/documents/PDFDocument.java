package FactoryMethod.factoryDocuments.documents;

public class PDFDocument extends Document{

    @Override
    public void open() {
        System.out.println("Abrindo documento PDF... ");
    }
}
