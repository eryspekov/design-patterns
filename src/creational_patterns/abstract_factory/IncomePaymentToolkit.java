package creational_patterns.abstract_factory;

public class IncomePaymentToolkit extends AbstractFactory {
    @Override
    public Document createPayment() {
        return new IncomePayment();
    }
}
