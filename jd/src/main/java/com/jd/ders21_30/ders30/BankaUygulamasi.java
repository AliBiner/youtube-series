package com.jd.ders21_30.ders30;

import java.util.Scanner;

import com.jd.ders21_30.ders30.Hesap.Implements.VadeliHesap;
import com.jd.ders21_30.ders30.Hesap.Implements.VadesizHesap;
import com.jd.ders21_30.ders30.Hesap.Interfaces.Hesap;

public class BankaUygulamasi {
    private static User[] users = new User[5];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Banka Uygulamasına Hoş Geldiniz!");

        BankaUygulamasi bankaUygulamasi = new BankaUygulamasi();

        for (int i = 0; i < users.length; i++) {
            bankaUygulamasi.kullanıcıOlustur(i);
        }
        while (true) {
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz! 1(Para Çekme), 2(Para Yatırma), 3(Bakiye Gösterme)");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Hangi kullanıcıdan para çekilecek: ");
                    int index = scanner.nextInt();
                    System.out.println("Çekilecek Miktarı Giriniz: ");
                    double miktar = scanner.nextDouble();
                    users[index].getHesap().paraCek(miktar);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Hangi kullanıcıya para yatırılacak: ");
                    int indexParaYatir = scanner.nextInt();
                    System.out.println("Yatırılacak Miktarı Giriniz: ");
                    double miktarParaYatır = scanner.nextDouble();
                    users[indexParaYatir].getHesap().paraYatir(miktarParaYatır);
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Sorgulanacak hesabı seçin: ");
                    int indexSorgu = scanner.nextInt();
                    double bakiye = users[indexSorgu].getHesap().bakiyeGoster();
                    System.out.println(bakiye);
                    scanner.nextLine();
                    break;
                default:
                    break;
            }
        }

    }

    public void kullanıcıOlustur(int index) {
        System.out.println("Kullanıcı Adı Giriniz: ");
        String kullanıcıAdı = scanner.nextLine();

        System.out.println("Hesap Türü Seçiniz. 1(Vadesiz), 2(Vadeli)");
        int secim = scanner.nextInt();
        scanner.nextLine();
        Hesap hesap = null;
        switch (secim) {
            case 1:
                System.out.println("Hesap Bakiyesi Giriniz: ");
                double bakiye = scanner.nextDouble();
                hesap = new VadesizHesap(bakiye);
                scanner.nextLine();
                break;
            case 2:
                System.out.println("Hesap Bakiyesi Giriniz:");
                double vadeliBakiye = scanner.nextDouble();
                hesap = new VadeliHesap(vadeliBakiye, false);
                scanner.nextLine();
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız!");
                break;
        }

        User user = new User(kullanıcıAdı, hesap);
        users[index] = user;
    }

}
