package creational_patterns.factory_method;

import creational_patterns.abstract_factory.Document;

public interface DocumentService {
    Document getDocumentByCode(String code);
}
