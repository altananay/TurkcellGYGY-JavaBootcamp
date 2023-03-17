package org.example;

/*Basit bir banka hesabı modellemek için bir program tasarlıyorsunuz.
        Hesapta bir bakiye bulunmaktadır ve bu bakiye yatırma veya çekme işlemleriyle artırılabilir veya azaltılabilir.
        Bakiye özelliği özel tutulmalı ve yalnızca getter ve setter yöntemleri aracılığıyla erişilebilir olmalıdır.
        Ayrıca, hesap bir yapıcı yönteme sahip olmalı ve bakiye belirtilen bir miktarla başlatılmalıdır.
        Bu banka hesabı modelini uygulayan bir Java sınıfı yazın.

        main() methodu içerisinde simüle ederek test ediniz.*/


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.ekle(200);
        System.out.println(bankAccount.getBakiye());
        bankAccount.withdraw(150);
        System.out.println(bankAccount.getBakiye());
    }
}