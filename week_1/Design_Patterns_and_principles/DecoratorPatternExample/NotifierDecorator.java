package Java_FSE.week_1.Design_Patterns_and_principles.DecoratorPatternExample;

public abstract class NotifierDecorator implements Notifier {
    private Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}
