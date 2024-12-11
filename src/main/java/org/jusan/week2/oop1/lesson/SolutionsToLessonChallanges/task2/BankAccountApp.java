package org.jusan.week2.oop1.lesson.SolutionsToLessonChallanges.task2;

public class BankAccountApp {
    public static void main(String[] args) {
        // Creating objects using both constructors
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("John Doe", 1000);

        // Using getter methods
        System.out.println("Account 1 - Owner: " + account1.getOwner() +
                ", Balance: " + account1.getBalance());
        System.out.println("Account 2 - Owner: " + account2.getOwner() +
                ", Balance: " + account2.getBalance());
    }
}
