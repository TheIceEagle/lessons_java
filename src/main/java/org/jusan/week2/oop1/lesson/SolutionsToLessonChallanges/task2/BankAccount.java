package org.jusan.week2.oop1.lesson.SolutionsToLessonChallanges.task2;

public class BankAccount {
    private String owner;
    private int balance;

    // Default constructor
    public BankAccount() {
        this.owner = "Unknown";
        this.balance = 0;
    }

    // Parameterized constructor
    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Getter methods
    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}

