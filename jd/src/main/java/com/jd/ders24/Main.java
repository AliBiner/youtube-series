package com.jd.ders24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        com.jd.ders24.Product product = new Product();
        // product.name = "Çikolata";
        // System.out.println(product.name);
        // product.setName("Çikolata");
        // System.out.println(product.getName());

        // System.out.print("Ürün adını giriniz: ");
        // String productName = scanner.nextLine();
        // product.setName(productName);
        // System.out.println(product.getName());

        System.out.println(product.getPrice());
    
        product.setPrice(10.33);

        System.out.println(product.getPrice());

        product.increasePriceByAmount(5);

        System.out.println(product.getPrice());

        product.increasePriceByAmount(-10);
        
        System.out.println(product.getPrice());
        
    }

    public static void test(){
        Product product = new Product();
        product.setName(null);
        System.out.println(product.getName());
    }
}
