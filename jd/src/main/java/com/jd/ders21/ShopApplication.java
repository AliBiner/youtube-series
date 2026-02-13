package com.jd.ders21;

import java.util.Scanner;

//kullanıcıların marketten almış oldukları ürünlerin birim değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

/*
- Çikolata : 12,60 TL
- Kola : 40,00 TL
- Cips : 33,00 TL
- Dondurma: 20,00 TL
- Bulgur(1 kg) : 10,00 TL
*/

public class ShopApplication {

    public static final int productSize = 5;

    public static void main(String[] args) {
        ShopApplication app = new ShopApplication();
        app.run();
    }

    public void run(){ //instance method
        
        String[] productNames = getProductNames();
        double[] pricePerUnit = getPricePerUnit();
        int[] units = getUnitSize(productNames);

        double totalPrice = calculateTotalPrice(pricePerUnit, units);

        System.out.println("Toplam Tutar: " + totalPrice);
    }

    public int[] getUnitSize(String[] productNames){

        Scanner scanner = new Scanner(System.in);
        int[] units = new int[productSize]; //integer için default değer 0 {0,1,0,2,3}

        for(int i = 0; i<units.length; i++){
            System.out.print(productNames[i] + " Kaç Adet? : ");
            int tmp = scanner.nextInt(); //-10
            if(tmp < 0){
                System.out.println("Eksi değer giremezsiniz!");
                continue;
            }
            units[i] = tmp;
        }

        return units;
    }

    public double calculateTotalPrice(double[] pricePerUnit, int[] units){
        double totalPrice = 0;
        for(int i = 0; i<units.length; i++){ 
            totalPrice = totalPrice + (pricePerUnit[i] * units[i]); 
        }
        return totalPrice;
    }

    public String[] getProductNames(){
        String[] productNames = new String[productSize]; 
        productNames[0] = "Çikolata";
        productNames[1] = "Kola";
        productNames[2] = "Cips";
        productNames[3] = "Dondurma";
        productNames[4] = "Bulgur(1 Kg)";
        
        return productNames;

    }

    public double[] getPricePerUnit(){
        double[] pricePerUnit = new double[productSize]; 
        pricePerUnit[0] = 12.60;
        pricePerUnit[1] = 40.00;
        pricePerUnit[2] = 33.00;
        pricePerUnit[3] = 20.00;
        pricePerUnit[4] = 10.00;

        return pricePerUnit;
    }


}
