package com.jd.ders21_30.ders27;

public class PolymorphismApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // 5 + 10 + 20

        // int sum = calculator.sum(5, 10);
        
        // int sum2 = calculator.sum(sum, 20);

        //int sum = calculator.sumFor3Numbers(5, 10, 20);
        int sum = calculator.sum(10.23,10);

        System.out.println(sum);
    }
}
