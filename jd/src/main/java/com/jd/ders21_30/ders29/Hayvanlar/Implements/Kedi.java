package com.jd.ders21_30.ders29.Hayvanlar.Implements;

import com.jd.ders21_30.ders29.Hayvanlar.Interfaces.SesliHayvanlar;

public class Kedi implements SesliHayvanlar {

    @Override
    public void sesCikar() {
        System.out.println("Miyav!");
    }

    public void Yuru(){
        System.out.println("Kedi yürüyor!");
    }

}
