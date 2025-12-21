package com.jd.ders9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 20;

        //System.out.println(age<18);

        /* 
        if(age<18){
            System.out.println("yaş 18'den küçük");
        }else{
            System.out.println("18'den büyük");
        }
        */

        //kayıt olma sistemi
        if(age<13){
            System.out.println("13 yaşından küçükler kayıt olamaz!");
        }else{
            System.out.println("Kayıt işlemi başarılı!");
        }


        // kitap kiralama

        if(age < 18){
            System.out.println("Veli onayı gerekmektedir.");
        }else if(age < 25){
            
            System.out.println("Öğrenci Numarası Giriniz: ");
            int ogrenciNO = scanner.nextInt();

            if(ogrenciNO<965_783){
                System.out.println("Bu öğrenci tıp kitabı haricinde kitap alamaz.");
            }else if(ogrenciNO < 837_437_387){
                System.out.println("Bu öğrenci mühendislik kitabı haricinde kitap alamaz.");
            }else{
                System.out.println("Öğrenci olmanız gerekiyor.");
            }
            
        }else if(age<40){
            System.out.println("Öğretmen olmanız lazım.");
        }else{
            System.out.println("Kitap başarılı şekilde kiralandı.");
        }

        if(age<20){
            System.out.println("dfsdf");
        }

        if(age >40){
            System.out.println("sdfsdf");
        }

    }
}
