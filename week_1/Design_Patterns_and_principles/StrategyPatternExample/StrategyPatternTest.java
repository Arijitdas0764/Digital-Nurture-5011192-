package Java_FSE.week_1.Design_Patterns_and_principles.StrategyPatternExample;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234567890"));
        paymentContext.executePayment(100);

        System.out.println("\n===== Switching Payment Method =====\n");

        paymentContext.setPaymentStrategy(new PayPalPayment("arijit@gmail.com"));
        paymentContext.executePayment(200);
    }
}
