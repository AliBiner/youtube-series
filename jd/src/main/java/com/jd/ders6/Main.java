package com.jd.ders6;


// = Assignment
// + addition
// - Subtraction
// * Multiplication
// / Division
// % Modulus
// ++ Increment
// -- Decrement

// Priority
// ()
// *,/,%
// +,-

public class Main {
    public static void main(String[] args) {
        
        // <variable type> <variable name> = value (değer);

        int sayi1 = 10;

        int sayi2 = 10 + 20;

        int s1 = 10;
        int s2 = 20;
        int s3 = s1 + s2;

        int cikarma1 = 10 - 5;
        int cikarma2 = 10;
        int cikarma3 = 5;

        int sonuc = -(cikarma3 - cikarma2);

        int carpma = 5 * 5;

        int bolme = 6 / 5;

        double bolme1 = 6; // 6.0

        double bolme2 = 5; // 5.0


        double bolmeSonuc1 = 6d / 5d;
        double bolmeSonuc2 = bolme1 / bolme2;

        // 10 % 3 = 1
        int mod1= 10;
        int mod2 = 3;

        int modSonuc = mod1 % mod2;

        int number1 = 10;
        number1++;
        number1++;

        number1--;
        number1--;
        number1--;
        number1--;


        int priority = (10 + 5) * 4;

        System.out.println(priority);

    }
}
