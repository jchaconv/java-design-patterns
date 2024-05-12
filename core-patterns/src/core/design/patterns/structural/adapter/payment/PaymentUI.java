package core.design.patterns.structural.adapter.payment;

public class PaymentUI {

    public static void main(String[] args) {
        paymentProcess(5940);
    }

    public static void paymentProcess(int soles) {

        PaymentAdapter paymentAdapter = new PaymentAdapter();
        paymentAdapter.processPayment(soles);

    }


}
