package creational_patterns.abstract_factory;

public class OutcomePaymentToolkit extends AbstractFactory {
    @Override
    public Document createPayment() {
        return new OutcomePayment();
    }
}
