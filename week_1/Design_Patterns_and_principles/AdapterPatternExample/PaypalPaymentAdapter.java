package Java_FSE.week_1.Design_Patterns_and_principles.AdapterPatternExample;

public class PaypalPaymentAdapter implements PaymentProcessor {
    private PaypalPaymentGateway paypalPaymentGateway;

    public PaypalPaymentAdapter(PaypalPaymentGateway paypalPaymentGateway) {
        this.paypalPaymentGateway = paypalPaymentGateway;
    }

    @Override
    public void processPayment() {
        paypalPaymentGateway.processPaypalPayment();
    }
}
