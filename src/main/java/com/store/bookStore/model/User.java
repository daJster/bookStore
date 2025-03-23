package com.store.bookStore.model;

public interface User {

    public String getName();

    public String getEmail();

    public String getPassword();


    public void setName(String name);

    public void setEmail(String email);

    public void setPassword(String password);


    public int display();
}
