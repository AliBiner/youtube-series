package com.jd.ders21;

//kullanıcıların marketten almış oldukları ürünlerin birim değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

import java.util.Scanner;

/*
- Çikolata : 12,60 TL
- Kola : 40,00 TL
- Cips : 33,00 TL
- Dondurma: 20,00 TL
- Bulgur(1 kg) : 10,00 TL
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int productSize = 5;
        
        String[] productNames = new String[productSize];
        double[] pricePerUnit = new double[productSize];
        int[] units = new int[productSize]; //integer için default değer 0 {0,1,0,2,3}

        productNames[0] = "Çikolata";
        productNames[1] = "Kola";
        productNames[2] = "Cips";
        productNames[3] = "Dondurma";
        productNames[4] = "Bulgur(1 Kg)";

        pricePerUnit[0] = 12.60;
        pricePerUnit[1] = 40.00;
        pricePerUnit[2] = 33.00;
        pricePerUnit[3] = 20.00;
        pricePerUnit[4] = 10.00;

        for(int i = 0; i<productSize; i++){
            System.out.print(productNames[i] + " Kaç Adet? : ");
            int tmp = scanner.nextInt(); //-10
            if(tmp < 0){
                System.out.println("Eksi değer giremezsiniz!");
                continue;
            }
            units[i] = tmp;
        }

        double totalPrice = 0;

        for(int i = 0; i<productSize; i++){
            totalPrice = totalPrice + (pricePerUnit[i] * units[i]);
        }


        System.out.println("Toplam Tutar: " + totalPrice);
    }
}
