package creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("legalPerson", new LegalPerson());
        prototypes.put("individual", new Individual());
    }

    public static Person getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}
