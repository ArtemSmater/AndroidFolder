package classworks;

import java.util.ArrayList;

public class Classwork6 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingAccount savingAccount = new SavingAccount(10000, 1.25);
        CurrentAccount currentAccount = new CurrentAccount(10000, 2000);
        bank.addAccount(savingAccount);
        bank.addAccount(currentAccount);
        bank.getInfo();
        bank.depositCash(savingAccount, 10000);
        bank.getInfo();
    }
}

interface Account {
    void depositCash(double amount);

    void getCash(double amount);

    void showInfo();

    double checkBalance();
}


// Сберегательный счет
class SavingAccount implements Account {

    private double balance;
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void depositCash(double amount) {
        balance += amount;
    }

    @Override
    public void getCash(double amount) {
        balance = -amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
    @Override
    public void showInfo() {
        System.out.printf("\n\n===== Сберегательный счет =====\n" +
                "Баланс: $%.2f\nПроцентная ставка: %.2f%%", balance, interestRate);
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
    }
}

// Актуальный аккаунт
class CurrentAccount implements Account {

    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void depositCash(double amount) {
        balance += amount;
    }

    @Override
    public void getCash(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }
    }

    @Override
    public void showInfo() {
        System.out.printf("\n\n===== Текущий счет =====\n" +
                "Баланс: $%.2f\nЛимит овердрафта: $%.2f", balance, overdraftLimit);
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void depositCash(Account account, double amount) {
        account.depositCash(amount);
    }

    public void withdraw(Account account, double amount) {
        account.getCash(amount);
    }

    public void getInfo() {
        for (Account account : accounts) {
            account.showInfo();
        }
    }

    public void getBalance() {
        for (Account account : accounts) {
            System.out.println(account.checkBalance());
        }
    }
}
