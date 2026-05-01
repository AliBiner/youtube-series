package com.jd.ders21_30.ders30;

import java.util.Random;

import com.jd.ders21_30.ders30.Hesap.Interfaces.Hesap;

public class User {

    private int id;
    private String name;
    private Hesap hesap;

    public User(String name, Hesap hesap) {
        this.name = name;
        this.hesap = hesap;
        Random random = new Random();
        this.id = random.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Hesap getHesap() {
        return hesap;
    }

    
    
}
