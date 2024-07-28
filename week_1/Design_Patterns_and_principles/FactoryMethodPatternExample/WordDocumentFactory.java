package Java_FSE.week_1.Design_Patterns_and_principles.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
