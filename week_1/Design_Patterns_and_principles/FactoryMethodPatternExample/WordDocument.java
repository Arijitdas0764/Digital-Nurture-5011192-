package Java_FSE.week_1.Design_Patterns_and_principles.FactoryMethodPatternExample;

public class WordDocument extends Document {
    @Override
    public void create() {
        System.out.println("Created Word Document...");
    }
}
