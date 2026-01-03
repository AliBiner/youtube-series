package com.jd.ders11;


public class Main {
    public static void main(String[] args) {
        //String pool - Heap
        
        String kelime = "Merhaba"; // sdhfs234234

        String kelime2 = "Merhaba"; // sdhfs234234

        String kelime3 = new String("Merhaba").intern();

        if(kelime == kelime2)
            System.out.println("Referanslar eşit");


        if(kelime2.equals(kelime3))
            System.out.println("Kelimeler Eşit");
        else
            System.out.println("Kelimeler eşit değil");

            
    }
}
