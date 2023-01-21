package com.s25323.bank.Model;

public class User {
    private int id;
    private String name;
    private String email;
    private String balance;

    public User(int id, String name, String email, String balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
