package com.jd.ders18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
        // Kullanıcıda 4 sayı al. eğer sayı pozitifse sayıları topla.
    }

    public static int sayiGetir(String mesaj){
            Scanner scanner = new Scanner(System.in);
    
            System.out.println(mesaj);
            int sayi = scanner.nextInt();

            return sayi;
    }
    
    public static boolean sayiPozitifMi(int deneme){
        if(deneme>0)
            return true;
        else
            return false; 
    }

    public static int arttır(int artacakDeger, int artacakMiktar){
        artacakDeger = artacakDeger + artacakMiktar;
        return artacakDeger;
    }

    public static void run(){
     

        int a = 0;

        for(int i = 0; i<4; i++){ // 0, 1,2,3,4
            String message = (i + 1) + ". Sayiyi giriniz: ";
            int b = sayiGetir(message);

            if(sayiPozitifMi(b)){
                a = arttır(a, b);
            }
        }

        a = arttır(a, a);
        
        System.out.println("toplam değer: " + a); 
    }
}
