package creational_patterns.builder;

public class IncomePaymentBuilder extends DocumentBuilder {
    @Override
    public void buildAmount(Integer amount) {
        document.setAmount(amount);
    }
}
