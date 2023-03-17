package org.example;

public class BankAccount {
    private double bakiye;

    public BankAccount()
    {

    }

    public BankAccount(double bakiye)
    {
        this.bakiye = bakiye;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void ekle(double money)
    {
        this.bakiye += money;
    }

    public void withdraw(double withdraw)
    {
        this.bakiye -= withdraw;
    }
}