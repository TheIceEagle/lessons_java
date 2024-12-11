package org.jusan.week2.oop1.lesson.SolutionsToLessonChallanges.task3;

public class BankAccountApp {
    public static void main(String[] args) {
        // Create accounts
        BankAccount aliceAccount = new BankAccount("Alice", 1000);
        BankAccount bobAccount = new BankAccount("Bob", 500);

        // Test operations
        System.out.println("Initial balances:");
        System.out.println(aliceAccount.getOwner() + ": $" + aliceAccount.getBalance());
        System.out.println(bobAccount.getOwner() + ": $" + bobAccount.getBalance());

        // Test deposit
        aliceAccount.deposit(200);
        System.out.println("\nAfter Alice deposits $200:");
        System.out.println(aliceAccount.getOwner() + ": $" + aliceAccount.getBalance());

        // Test transfer
        aliceAccount.transferTo(bobAccount, 300);
        System.out.println("\nAfter Alice transfers $300 to Bob:");
        System.out.println(aliceAccount.getOwner() + ": $" + aliceAccount.getBalance());
        System.out.println(bobAccount.getOwner() + ": $" + bobAccount.getBalance());

    }
}
