package com.jd.ders21_30.ders29;

import com.jd.ders21_30.ders29.Hayvanlar.Implements.Kedi;
import com.jd.ders21_30.ders29.Hayvanlar.Implements.Kopek;
import com.jd.ders21_30.ders29.Hayvanlar.Implements.Kus;
import com.jd.ders21_30.ders29.Hayvanlar.Interfaces.SesliHayvanlar;

public class InterfaceApplication {
    public static void main(String[] args) {
        // Kedi kedi = new Kedi();
        // kedi.sesCikar();
        

        // Kopek kopek = new Kopek();
        // kopek.sesCikar();

        // Kus kus = new Kus();
        // kus.sesCikar();

        // SesliHayvanlar kedi2 = new Kedi();

        SesliHayvanlar[] hayvanlar = new SesliHayvanlar[6];

        hayvanlar[0] = new Kedi();
        hayvanlar[1] = new Kopek();
        hayvanlar[2] = new Kus();
        hayvanlar[3] = new Kedi();
        hayvanlar[4] = new Kus();

        for (int i = 0; i < hayvanlar.length; i++) {
            hayvanlar[i].sesCikar();
        }
    }
}
