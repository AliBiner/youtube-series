package com.jd.ders17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /* int sayi = getNumber();

        int sayi1 = getNumber();

       int toplam = sayi + sayi1;

       System.out.println(toplam); */



        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number1 = scanner.nextInt();


         Scanner scanner2 = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number2 = scanner.nextInt();


        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number3 = scanner.nextInt();
    }


    // erişim belirleyici - static/non-static - return type - method ismi - parametreler
    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int number = scanner.nextInt();

        return number;
    }


}
