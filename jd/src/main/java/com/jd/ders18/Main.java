package com.jd.ders18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //döngü - loop - for loop / while / do-while

        // Kullanıcıda 4 sayı al. eğer sayı pozitifse sayıları topla.

        Scanner scanner = new Scanner(System.in);

        /* System.out.println("sayı 1'i giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.println("sayı 2'i giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.println("sayı 3'i giriniz: ");
        int sayi3 = scanner.nextInt();

        System.out.println("sayı 4'i giriniz: ");
        int sayi4 = scanner.nextInt();

        int toplam = sayi1 + sayi2 + sayi3 + sayi4; */

        int toplam = 0;

        for(int i = 0; i<4; i++){ // 0, 1,2,3,4

            String mesaj = (i + 1) + ". sayıyı giriniz: ";
        
            System.out.println(mesaj);
            int sayi = scanner.nextInt();
            if(sayi>0){
                toplam = toplam + sayi;
            } 
        }
        
        System.out.println("toplam değer: " + toplam);

    }

    

}
