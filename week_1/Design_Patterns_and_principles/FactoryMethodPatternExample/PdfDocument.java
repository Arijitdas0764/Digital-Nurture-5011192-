package Java_FSE.week_1.Design_Patterns_and_principles.FactoryMethodPatternExample;

public class PdfDocument extends Document {
    @Override
    public void create() {
        System.out.println("Created PDF Document...");
    }
}
