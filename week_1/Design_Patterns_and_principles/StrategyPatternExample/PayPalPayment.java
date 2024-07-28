package Java_FSE.week_1.Design_Patterns_and_principles.StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying Rs." + amount + " using PayPal " + email);
    }
}