package com.jd.ders15;

import java.util.Scanner;

/*
    constants
*/
public class Main {
    //değiştirilmemeli
    static final String welcomeMessage = "Uygulamaya Hoş Geldiniz";

    //değiştirilmemeli
    static final double pi = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(welcomeMessage);

        System.out.println("çap giriniz: ");
        //pi = scanner.nextInt();

        double result = pi * pi;

        final char karakter;

        karakter = 'b';

        karakter = 'c';

        System.out.println(result);

    }
}
