package svyat_challanges;

@SuppressWarnings("unused")
public class Main {
public static void main (String[] args){
    // создание аккаунтов
    BankAccount acc1 = new BankAccount();
    acc1.setOwner("Svyat");
    acc1.setBalance(777);
    BankAccount acc2 = new BankAccount("Ivan", 666);

    // вывод информации
    acc1.infoAccount();
    acc2.infoAccount();
    System.out.println();

    // пополнение баланса
    acc1.addBalance(333);
    acc2.addBalance(444);
    System.out.println();

    // снятие денег
    acc1.takeBalance (500);
    acc2.takeBalance (600);
    System.out.println();

    //перевод
    acc1.transferMoney(acc2,250);
    acc1.infoAccount();
    acc2.infoAccount();
    System.out.println();
}
}