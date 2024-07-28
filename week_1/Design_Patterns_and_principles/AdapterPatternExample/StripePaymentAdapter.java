package Java_FSE.week_1.Design_Patterns_and_principles.AdapterPatternExample;

public class StripePaymentAdapter implements PaymentProcessor {
    private StripePaymentGateway stripePaymentGateway;

    public StripePaymentAdapter(StripePaymentGateway stripePaymentGateway) {
        this.stripePaymentGateway = stripePaymentGateway;
    }

    @Override
    public void processPayment() {
        stripePaymentGateway.processStripePayment();
    }
}
