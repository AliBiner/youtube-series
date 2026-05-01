package com.jd.ders21_30.ders30.Hesap.Implements;

import com.jd.ders21_30.ders30.Hesap.Interfaces.Hesap;

public class VadeliHesap implements Hesap {

    private double bakiye = 0.00;
    private boolean vadeSuresiDolduMu = true;

    public VadeliHesap(double bakiye, boolean vadeSuresiDolduMu) {
        if (bakiye < 0) {
            System.out.println("Bakiye Negatif Olamaz!");
            this.bakiye = 0;
            this.vadeSuresiDolduMu = true;
        } else {
            this.bakiye = bakiye;
            this.vadeSuresiDolduMu = vadeSuresiDolduMu;
        }

    }

    @Override
    public void paraYatir(double miktar) {
        if (miktar < 0) {
            System.out.println("Yatırılacak Miktar Negatif Olamaz!");
        } else if (!vadeSuresiDolduMu) {
            System.out.println("Vade Süresi Dolmadan Para Yatırılamaz!");
        } else {
            this.bakiye = this.bakiye + miktar;
            System.out.println("Para Yatırıldı!");
        }

    }

    @Override
    public void paraCek(double miktar) {
        if (miktar < 0) {
            System.out.println("Çekilecek Miktar Negatif Olamaz!");
        } else if (!vadeSuresiDolduMu) {
            System.out.println("Vade Süresi Dolmadan Para Çekilemez!");
        } else if (miktar > bakiye) {
            System.out.println("Çekilmek İstenen Miktar Bakiye'den Fazla Olamaz!");
        } else {
            this.bakiye = this.bakiye - miktar;
            System.out.println("Para Çekildi!");
        }
    }

    @Override
    public double bakiyeGoster() {
        return bakiye;
    }

}
