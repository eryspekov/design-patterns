package creational_patterns.abstract_factory;

abstract class AbstractFactory {
    private static final IncomePaymentToolkit INCOME_TOOLKIT = new IncomePaymentToolkit();
    private static final OutcomePaymentToolkit OUTCOME_TOOLKIT = new OutcomePaymentToolkit();

    static AbstractFactory getFactory(Document.Type type) {
        AbstractFactory factory = null;
        switch (type) {
            case OUT:
                factory = OUTCOME_TOOLKIT;
                    break;
            case IN:
                factory = INCOME_TOOLKIT;
                break;
        }
        return factory;
    }

    public abstract Document createPayment();
}
