package com.jd.ders20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int toplam = 10+ 20 + 30;

        int sayi1 = 10;
        int sayi2 =20;

        int sayi3 = 30;
        int sayi4 = 40;

        int toplam2 = sayi1 + sayi2 + sayi3;
        //System.out.println(toplam2);

        int[] sayiDizisi = new int[4]; // 0,1,2

        Scanner scanner = new Scanner(System.in);
        sayiDizisi[0] = 10;
        sayiDizisi[1] = 20;
        sayiDizisi[2] = 30;
        //sayiDizisi[3] = 40;

        for(int i = 0; i < sayiDizisi.length; i++){ //0,1,2
            System.out.println( (i+1) + ". sayiyi giriniz: ");
            sayiDizisi[i] = scanner.nextInt();
        }
    }
}
