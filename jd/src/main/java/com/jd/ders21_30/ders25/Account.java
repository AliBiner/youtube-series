package com.jd.ders21_30.ders25;

import java.util.UUID;

public class Account {
    private String number; //default null
    private String ownerName; //default null
    private double balance; //default 0.0
    private boolean isActive; //default false


    //Constructor Method
    public Account(String ownerName){
        if(ownerName == null)
            System.out.println("Hesap Sahip Adı Null olamaz!");
        else if(ownerName.length()<3)
            System.out.println("Hesap Sahip Adı 3 krakterden az olamaz!");
        else
            this.ownerName = ownerName;

        this.number = UUID.randomUUID().toString();
        this.balance = 0.00;
        this.isActive = true;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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
