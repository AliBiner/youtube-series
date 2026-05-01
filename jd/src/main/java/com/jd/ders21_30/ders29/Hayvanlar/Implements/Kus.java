package com.jd.ders21_30.ders29.Hayvanlar.Implements;

import com.jd.ders21_30.ders29.Hayvanlar.Interfaces.SesliHayvanlar;

public class Kus implements SesliHayvanlar {

    @Override
    public void sesCikar() {
        System.out.println("Cik Cik!");
    }

    public void uc(){
        System.out.println("Kuş uçuyor");
    }

}
