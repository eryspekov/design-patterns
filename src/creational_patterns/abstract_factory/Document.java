package creational_patterns.abstract_factory;

import java.time.LocalDateTime;

abstract class Document {

    protected String code;
    protected LocalDateTime createdDate;
    protected Integer amount;

    public enum Type {
        IN, OUT
    }
}
