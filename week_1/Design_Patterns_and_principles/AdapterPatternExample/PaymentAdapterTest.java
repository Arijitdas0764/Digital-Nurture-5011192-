package Java_FSE.week_1.Design_Patterns_and_principles.AdapterPatternExample;

public class PaymentAdapterTest {
    public static void main(String[] args) {
        PaymentProcessor paypalPaymentProcessor = new PaypalPaymentAdapter(new PaypalPaymentGateway());
        paypalPaymentProcessor.processPayment();

        PaymentProcessor stripePaymentProcessor = new StripePaymentAdapter(new StripePaymentGateway());
        stripePaymentProcessor.processPayment();
    }
}
