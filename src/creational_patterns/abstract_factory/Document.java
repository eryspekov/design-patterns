package creational_patterns.abstract_factory;

import java.time.LocalDateTime;

public abstract class Document {

    protected String code;
    protected LocalDateTime createdDate;
    protected Integer amount;

    public enum Type {
        IN, OUT
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
