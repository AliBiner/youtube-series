package com.jd.ders12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("0-3 arasındaki bir sayı giriniz");
        int choise = scanner.nextInt();


        /*if(choise==0)
            System.out.println("0 girdiniz");
        else if(choise == 1)
            System.out.println("1 girdiniz");
        else if(choise == 2)
            System.out.println("2 girdiniz");
        else if(choise == 3)
            System.out.println("3 girdiniz");
        else
            System.out.println("Beklenmeyen bir değer girdiniz");*/

        switch(choise){
            case 0: System.out.println("0 girdiniz"); 
            break;
            case 1: System.out.println("1 girdiniz"); 
            break;
            case 2: System.out.println("2 girdiniz");
            break;
            case 3: System.out.println("3 girdiniz");
            break;
            default:System.out.println("Beklenmeyen bir değer girdiniz"); 
            break;
        }


    }
}
