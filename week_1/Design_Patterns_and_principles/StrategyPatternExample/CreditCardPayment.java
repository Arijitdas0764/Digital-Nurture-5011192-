package Java_FSE.week_1.Design_Patterns_and_principles.StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying Rs." + amount + " using Credit Card " + cardNumber);
    }
}
