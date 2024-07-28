package Java_FSE.week_1.Design_Patterns_and_principles.DecoratorPatternExample;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        slackNotifier.send();
    }
}
