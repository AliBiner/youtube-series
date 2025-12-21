package com.jd.ders7;

// Vücut kitle indeksi hesaplama - kullanıcı verileri verecek.
// kilo / boy(m) * boy(m)

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuzu giriniz: ");
        
        double kilo = scanner.nextDouble();

        System.out.println("Boyunuzu metre cinsinden giriniz: ");

        double boy = scanner.nextDouble();

        double sonuc = kilo / (boy * boy);

        System.out.println("VKI: " + sonuc);

    }
}
