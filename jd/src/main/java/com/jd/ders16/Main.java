package com.jd.ders16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int number = getNumber();

        isNegative(number);

        isNegative(10);
        isNegative(10);
        isNegative(10);
        isNegative(10);
        isNegative(10);
        isNegative(10);
        isNegative(10);
        isNegative(10);
        isNegative(10);
        isNegative(10);

    }

    public static boolean isNegative(int number){
        if(number<0){
            System.out.println("Sayı küçük");
            return true;
        }else{
            System.out.println("Sayı büyük");
            return false;
        }
    }

    public static int getNumber(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Sayı giriniz!");
        return  scanner.nextInt();
    }

}
