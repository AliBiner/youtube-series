package com.jd.ders21_30.ders25;

import java.util.UUID;

public class Account {
    private String number; //default null
    private String ownerName; //default null
    private double balance; //default 0.0
    private boolean isActive; //default false


    //Constructor Method
    public Account(String ownerName){
        setOwnerName(ownerName);
        this.number = UUID.randomUUID().toString();
        this.balance = 0.00;
        this.isActive = true;
    }

    //getters
    public String getNumber() {
        return number;
    }

    public void setOwnerName(String ownerName){
        if(ownerName == null)
            System.out.println("Hesap Sahip Adı Null olamaz!");
        else if(ownerName.length()<6)
            System.out.println("Hesap Sahip Adı 6 krakterden az olamaz!");
        else
            this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isIsActive() {
        return isActive;
    }

    //domain logic methods
    public void depositByAmount(double amount){
        if(isActive == false){
            System.out.println("Hesap Kapalı!");
        }
        else if(amount<0){
            System.out.println("Miktar pozitif olmalı!");
        }else{
            this.balance = this.balance + amount;
            System.out.println(amount + " TL yatırıldı. Güncel Bakiye: " + this.balance);
        }
    }

    public void withdrawByAmount(double amount){
        if(isActive == false){
            System.out.println("Hesap Kapalı!");
        }
        else if(amount<0){
            System.out.println("Miktar pozitif olmalı!");
        }else if(amount > this.balance){
            System.out.println("Yetersiz bakiye!");
        }else{
            this.balance = this.balance - amount;
            System.out.println(amount + " TL çekildi. Güncel Bakiye: " + this.balance);
        }
    }

    public void closeAccount(){
        this.isActive = false;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account{");
        sb.append("number=").append(number);
        sb.append(", ownerName=").append(ownerName);
        sb.append(", balance=").append(balance);
        sb.append(", isActive=").append(isActive);
        sb.append('}');
        return sb.toString();
    }
}
