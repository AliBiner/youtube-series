package com.jd.ders19;

import java.util.Scanner;

/*
Klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
*/
public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        
        int count = getRepeatCount();

        findMinMaxNumbers(count);

    }

    public static void findMinMaxNumbers(int count){
        Scanner scanner = new Scanner(System.in);   
        int min = Integer.MAX_VALUE; //2147483647
        int max = Integer.MIN_VALUE; //-2_147_483_648 

        for(int i = 0; i < count; i++){
            System.out.println( (i +1 ) + ". sayiyi giriniz: ");
            int tmp = scanner.nextInt();

            if(tmp < min){
                min = tmp;
            }
            if(tmp>max){
                max = tmp;
            }
        }

        System.out.println("En küçük sayı: " + min + " - En Büyük Sayı: " + max);
    }


    public static int getRepeatCount(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç sayıyı kıyaslayacaksınız: "); // 4
        int tekrarSayisi = scanner.nextInt();

        return tekrarSayisi;
    }
}
