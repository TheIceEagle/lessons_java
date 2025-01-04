package svyat_challanges;

import svyatoslav_petukhov_oop1.Employee;

public class BankAccount {
    // создание 2 свойств
    private String owner;
    private int balance;
    // конструктор по умолчанию
    public BankAccount () {
        this.owner = "Unknown";
        this.balance = 0;
        }
    // конструктор с параметрами
    public BankAccount (String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    //геттеры+сеттеры
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    //метод для вывода инфы об аккаунте
    public void infoAccount (){
        System.out.println("Owner: "+owner);
        System.out.println("Balance: "+balance);
    }

    // пополнение баланса
    public void addBalance (int amount) {
        if (amount <= 0) {
            System.out.println("Amount is not positive");
        } else {
            balance += amount;
            System.out.println("Add amount "+amount +" in account " + owner + ". New balance: " + balance);
        }
    }

    // снятие денег
    public void takeBalance (int amount) {
        if (amount <= 0) {
            System.out.println("Amount is not positive");
        } else if (amount > this.balance) {
            System.out.println("The amount exceeds the amount on the account");
        } else {
            balance -= amount;
            System.out.println("Take amount "+amount +" from account " + owner + ". New balance: " + balance);
        }
    }

    // перевод
    public void transferMoney (BankAccount targetAcc, int amount){
        if (amount <=0) {
            System.out.println("Amount is not positive");
        } else if (amount>this.balance) {
            System.out.println("The amount exceeds the amount on the account");
        } else {
            this.balance -= amount;
            System.out.println("Money transfer made: "+amount);
            targetAcc.addBalance(amount);
        }
    }

}