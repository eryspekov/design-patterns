package creational_patterns.builder;

import creational_patterns.abstract_factory.Document;

public class App {

    public static void main(String[] args) {
        DocumentEndpoint documentEndpoint = new DocumentEndpoint();
        IncomePaymentBuilder incomePaymentBuilder = new IncomePaymentBuilder();
        documentEndpoint.setDocumentBuilder(incomePaymentBuilder);
        documentEndpoint.constructDocument(Document.Type.IN, 155);
        Document document = documentEndpoint.getDocument();
    }
}
