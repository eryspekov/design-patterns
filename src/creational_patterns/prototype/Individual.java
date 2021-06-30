package creational_patterns.prototype;

public class Individual implements Person {

    @Override
    public Person clone() {
        return new Individual();
    }

    @Override
    public String toString() {
        return "Individual person";
    }
}
