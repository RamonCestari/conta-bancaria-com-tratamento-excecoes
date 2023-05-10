package model.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;

    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;


    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }


    public void amount(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount > withdrawLimit) {
            throw new IllegalArgumentException("Withdraw Error: The amount exceeds withdraw limits!");
        } else if (amount > balance){
            throw new IllegalArgumentException("Withdraw Error: Not enough balance!");
        } else
        balance -= amount;
    }

}