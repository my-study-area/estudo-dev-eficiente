package paymentprocessor;

import java.util.ArrayList;
import java.util.List;

public class Billing {

    private static final int MAX_PAYMENTS = 10;
    private List<Payment> payments = new ArrayList<>();

    public List<Payment> getPayments() {
        return List.copyOf(payments);
    }

    public void addPayment(Payment payment) {
        if (payments.size() > MAX_PAYMENTS) {
            throw new RuntimeException("Maximum number of payments reached!");
        }
        payments.add(payment);
    }
}
