package ex4;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {

    List<Payment> payments = new ArrayList<>();

     void addUser(Payment user) {
        payments.add(user);
    }

     void showPreviousPayments() {
        for (Payment payment : payments) {
            if (payment instanceof RegisteredUserPayment) {
                ((RegisteredUserPayment) payment).previousPaymentInfo();
                System.out.println("------");
            }
        }
    }

     void processNewPayments() {
        for (Payment payment : payments) {
            payment.newPayment();
            System.out.println("------");
        }
    }
}