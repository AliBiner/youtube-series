package com.jd.ders21_30.ders25;

public class Account {
    public String number;
    public String ownerName;
    public double balance;
    public boolean isActive;

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
