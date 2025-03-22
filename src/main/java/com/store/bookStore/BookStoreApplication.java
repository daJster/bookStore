package com.store.bookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BookStoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
//		var orderService = new OrderService(new StripePaymentService());
		orderService.placeOrder(100);
	}

}
