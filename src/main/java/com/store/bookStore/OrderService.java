package com.store.bookStore;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class OrderService {
    private PaymentService paymentService;

     public OrderService(PaymentService ps) {
        this.paymentService = ps;
     }

    public void placeOrder(double amount) {
        this.paymentService.processPayment(amount);
        System.out.println("Order placed");
    }

}
