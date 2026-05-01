package com.jd.ders21_30.ders30.Hesap.Implements;

import com.jd.ders21_30.ders30.Hesap.Interfaces.Hesap;

public class VadesizHesap implements Hesap {

    private double bakiye;

    
    public VadesizHesap(double bakiye) {
        if (bakiyeKontrol(bakiye)) {
            this.bakiye = 0;
        }
        this.bakiye = bakiye;
    }

    @Override
    public void paraYatir(double miktar) {
        if (miktar<0) {
            System.out.println("Yatırılacak Miktar Negatif Olamaz!");
        }else{
            this.bakiye = this.bakiye + miktar;
            System.out.println("Para Yatırıldı!");
        }
    }

    @Override
    public void paraCek(double miktar) {
       if (miktar<0) {
            System.out.println("Çekilecek Miktar Negatif Olamaz!");
       }else if(miktar>bakiye){
            System.out.println("Çekilecek Miktar Bakiyeden Büyük Olamaz!");
       }else{
            this.bakiye = this.bakiye - miktar;
            System.out.println("Para Çekildi!");
       }
    }

    @Override
    public double bakiyeGoster() {
        return bakiye;
    }

    private static boolean bakiyeKontrol(double bakiye){
        if (bakiye<0) {
            System.out.println("Bakiye negatif olamaz!");
            return true;
        } 
        return false;
    }

}
