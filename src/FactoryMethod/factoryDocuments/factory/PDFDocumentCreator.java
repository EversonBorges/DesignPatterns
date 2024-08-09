package FactoryMethod.factoryDocuments.factory;

import FactoryMethod.factoryDocuments.documents.Document;
import FactoryMethod.factoryDocuments.documents.PDFDocument;
import FactoryMethod.factoryDocuments.documents.WordDocument;

public class PDFDocumentCreator extends DocumentCreator{

    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
