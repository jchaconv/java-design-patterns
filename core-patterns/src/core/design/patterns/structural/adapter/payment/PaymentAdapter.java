package core.design.patterns.structural.adapter.payment;

public class PaymentAdapter {

    public double processPayment(int solesPayment) {
        double dollarPayment = solesPayment / 3.69;
        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        paymentProcessor.processPayment(dollarPayment);
        return dollarPayment;
    }

}
