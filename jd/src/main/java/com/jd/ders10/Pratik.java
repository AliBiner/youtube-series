package com.jd.ders10;

import java.util.Scanner;

/*
Otobüs bileti fiyatı hesaplayan program

Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Kilometre başına 0,50 TL ücret alınacak. 

İlk olarak otobüsün toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 3 yaşından küçükse bilet fiyatı üzerinden %100 indirim uygulanır.
Kişi 3-12 yaşından küçükse %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise indirimli bilet fiyatı üzerinden %20 indirim uygulanır.
*/
















public class Pratik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hataMesaji = "Hatalı Veri Girdiniz !";

        System.out.println("Mesafe bilgisi giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Yolculuk Tipi Seçiniz (1- Tek Yön, 2- Gidiş Dönüş)");
        byte yolculukTipi = scanner.nextByte();

        if(mesafe<1 || yas <0 || yolculukTipi <0 || yolculukTipi > 2){
            System.out.println(hataMesaji);
            return;
        }

        /*
        if(yas <0){
            System.out.println(hataMesaji);
            return;
        }
         
        if(yolculukTipi <0 || yolculukTipi > 2){
            System.out.println(hataMesaji);
            return;
        }
        */


        double toplamFiyat = mesafe * 0.50;
        double indirimliFiyat = 0;

        if(yas<3){
            //indirimliFiyat = 0;
        }else if(yas < 12){
            indirimliFiyat = toplamFiyat - (toplamFiyat * 0.50);
        }else if(yas < 24){
            indirimliFiyat = toplamFiyat - ( toplamFiyat * 0.10);
        }else if(yas > 65){
            indirimliFiyat = toplamFiyat - (toplamFiyat * 0.30);
        }

        if(yolculukTipi == 1){
            System.out.println("Toplam Fiyat= " + toplamFiyat);
            System.out.println("Ödenecek Fiyat= " + indirimliFiyat);
        }else{
            double yolculukTipiİndirimi = indirimliFiyat - (indirimliFiyat * 0.20);
            System.out.println("Toplam Fiyat= " + toplamFiyat);
            System.out.println("Ödenecek Fiyat= " + yolculukTipiİndirimi);
        }

    }
    


}
