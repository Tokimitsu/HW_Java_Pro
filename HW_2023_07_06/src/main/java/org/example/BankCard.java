package org.example;

public class BankCard {
    private String cardInfo;
    private Currency currency;
    private Status status;

    @Override
    public String toString() {
        return "BankCard{" +
                "cardInfo=" + cardInfo +
                ", currency=" + currency +
                ", status=" + status +
                '}';
    }

    public String getCardInfo() {
        return cardInfo;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Status getStatus() {
        return status;
    }

    public BankCard(String cardInfo, Currency currency, Status status) {
        this.cardInfo = cardInfo;
        this.currency = currency;
        this.status = status;
    }
}
