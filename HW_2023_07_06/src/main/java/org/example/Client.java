package org.example;

public class Client {
    private String name;
    private BankCard bankCard;
    private int balance;

    public Client(String name, BankCard bankCard) {
        this.name = name;
        this.bankCard = bankCard;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", bankCard=" + bankCard +
                                '}' + "balance " ;
    }

    public String getName() {
        return name;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public int getBalance() {
        return balance;
    }
}
