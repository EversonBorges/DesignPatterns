package FactoryMethod.factoryDocuments.factory;

import FactoryMethod.factoryDocuments.documents.Document;
import FactoryMethod.factoryDocuments.documents.WordDocument;

public class WordDocumentCreator extends DocumentCreator{

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
