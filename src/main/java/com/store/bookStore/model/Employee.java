package com.store.bookStore.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Entity
@Data
@Table(name = "employees")
public class Employee implements User {
    @Getter
    @Setter
    @Column(name = "username")
    private String name;

    @Getter
    @Setter
    @Column(name = "email")
    private String email;

    @Getter
    @Setter
    @Column(name = "password")
    private String password;

    @Setter
    @Getter
    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Employee() {
        this.name = "";
        this.email = "";
        this.password = "";
        this.dateOfBirth = "";
    }

    @Autowired
    public Employee(String name, String email, String password, LocalDate dateOfBirth) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateOfBirth = DateTimeFormatter.ofPattern("dd-MM-YYYY").format(dateOfBirth);
    }

    @Override
    public int display() {
        System.out.println("ID: " + this.id);
        System.out.println("Employee name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("Date of birth: " + this.dateOfBirth);
        return 0;
    }
}
