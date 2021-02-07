package creational_patterns.abstract_factory;

public class App {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Document.Type.IN);
        Document document = factory.createPayment();
    }
}
