package com.jd.ders21_30.ders29.Hayvanlar.Implements;

import com.jd.ders21_30.ders29.Hayvanlar.Interfaces.SesliHayvanlar;

public class Kopek implements SesliHayvanlar {
    
    @Override
    public void sesCikar() {
        System.out.println("Hav Hav!");
    }

    public void kos() {
        System.out.println("Köğek koşuyor.");
    }

}
