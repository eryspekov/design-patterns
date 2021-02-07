package creational_patterns.builder;

public class OutcomePaymentBuilder extends DocumentBuilder {
    @Override
    public void buildAmount(Integer amount) {
        document.setAmount(-amount);
    }
}
