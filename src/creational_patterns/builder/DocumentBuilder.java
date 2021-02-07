package creational_patterns.builder;

import creational_patterns.abstract_factory.Document;
import creational_patterns.abstract_factory.IncomePayment;
import creational_patterns.abstract_factory.OutcomePayment;

public abstract class DocumentBuilder {

    protected Document document;

    public Document getDocument() {
        return document;
    }

    public void createDocument(Document.Type type) {
        switch (type) {
            case IN:
                document = new IncomePayment();
                break;
            case OUT:
                document = new OutcomePayment();
                break;
        }
    }

    public abstract void buildAmount(Integer amount);
}
