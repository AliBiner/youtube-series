package com.jd.ders21_30.ders25;

import java.util.UUID;

public class Account {
    private final String number; //default null
    private String ownerName; //default null
    private double balance; //default 0.0
    private boolean isActive; //default false

    private final static int OWNER_NAME_MIN_LENGTH = 6;
    private final static String ACCOUNT_MUST_BE_ACTIVE = "Hesap Kapalı! İşlem yapamazsınız!";
    private final static String AMOUNT_MUST_POZITIVE =  "Miktar pozitif olmalı!";
    private final static String YETERSIZ_BALANCE = "Yetersiz bakiye!";


    //Constructor Method
    public Account(String ownerName){
        if(checkOwnerName(ownerName)){
            this.ownerName = ownerName;
        }
        this.number = UUID.randomUUID().toString();
        this.balance = 0.00;
        this.isActive = true;
    }

    //getters
    public String getNumber() {
        return number;
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

    public void setOwnerName(String ownerName){
        if(checkOwnerName(ownerName)){
            this.ownerName = ownerName;
        }
    }

    private boolean checkOwnerName(String ownerName){
        if(ownerName == null){
            System.out.println("Hesap Sahip Adı Null olamaz!");
            return false;
        }
        else if(ownerName.length()<OWNER_NAME_MIN_LENGTH){ 
            System.out.println("Hesap Sahip Adı 6 krakterden az olamaz!");
            return false;
        }
        return true;
    }

    //domain logic methods
    public void depositByAmount(double amount){
        if(isActive == false){
            System.out.println(ACCOUNT_MUST_BE_ACTIVE);
        }
        else if(amount<0){
            System.out.println(AMOUNT_MUST_POZITIVE);
        }else{
            this.balance = this.balance + amount;
            System.out.println(amount + " TL yatırıldı. Güncel Bakiye: " + this.balance);
        }
    }

    public void withdrawByAmount(double amount){
        if(isActive == false){
            System.out.println(ACCOUNT_MUST_BE_ACTIVE);
        }
        else if(amount<0){
            System.out.println(AMOUNT_MUST_POZITIVE);
        }else if(amount > this.balance){
            System.out.println(YETERSIZ_BALANCE);
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
