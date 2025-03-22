package com.store.bookStore;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using PAYPAL.");
    }
}
