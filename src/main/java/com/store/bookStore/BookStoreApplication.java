package com.store.bookStore;

import com.store.bookStore.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.store.bookStore.model.Employee;

import java.time.LocalDate;

@SpringBootApplication
public class BookStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
        User newUser = new Employee(
                "John Doe",
                "8oEoT@example.com",
                "password135",
                LocalDate.of(2001, 12, 18)
        );
    }
}
