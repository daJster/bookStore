package com.store.bookStore;



public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using STRIPE.");
    }
}
