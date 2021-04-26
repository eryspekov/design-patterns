package creational_patterns.factory_method;

import creational_patterns.abstract_factory.Document;

public class App {

    public static void main(String[] args) {
        String code = "0001";
        DocumentService service = new IncomePaymentService();
        Document document = service.getDocumentByCode(code);
    }
}
