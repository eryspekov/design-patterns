package creational_patterns.factory_method;

import creational_patterns.abstract_factory.Document;
import creational_patterns.abstract_factory.IncomePayment;

public class IncomePaymentService implements DocumentService {

    @Override
    public Document getDocumentByCode(String code) {
        IncomePayment incomePayment = new IncomePayment();
        incomePayment.setCode(code);
        return incomePayment;
    }
}
