package creational_patterns.prototype;

public class LegalPerson implements Person {

    @Override
    public Person clone() {
        return new LegalPerson();
    }

    @Override
    public String toString() {
        return "Legal person";
    }
}
