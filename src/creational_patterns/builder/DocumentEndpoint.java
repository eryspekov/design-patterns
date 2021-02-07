package creational_patterns.builder;

import creational_patterns.abstract_factory.Document;

public class DocumentEndpoint {
    private DocumentBuilder documentBuilder;

    public void setDocumentBuilder(DocumentBuilder documentBuilder) {
        this.documentBuilder = documentBuilder;
    }

    public Document getDocument() {
        return documentBuilder.document;
    }

    public void constructDocument(Document.Type type, Integer amount) {
        documentBuilder.createDocument(type);
        documentBuilder.buildAmount(amount);
    }
}
