package Java_FSE.week_1.Design_Patterns_and_principles.DecoratorPatternExample;

public class EmailNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Sending notification via Email...");
    }
}