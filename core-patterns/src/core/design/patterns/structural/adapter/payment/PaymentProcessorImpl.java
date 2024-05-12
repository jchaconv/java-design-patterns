package core.design.patterns.structural.adapter.payment;

import java.text.DecimalFormat;

public class PaymentProcessorImpl implements PaymentProcessor {


    @Override
    public void processPayment(double dollars) {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Processed Payment  of " + df.format(dollars) + " dollars");
    }
}
