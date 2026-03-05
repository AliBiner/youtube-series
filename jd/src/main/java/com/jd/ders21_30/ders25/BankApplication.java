package com.jd.ders21_30.ders25;

public class BankApplication {
    public static void main(String[] args) {
        Account ali = new Account();

        String accountNumber = AccountHelper.generateAccountNumber();

        ali.number = accountNumber;
        ali.ownerName = null;
        ali.balance = -1000;
        ali.isActive = false;
        System.out.println(ali);
        ali.balance = ali.balance - 1000;
        System.out.println(ali);
        
        ali.number = null;
    }

    

    
}
