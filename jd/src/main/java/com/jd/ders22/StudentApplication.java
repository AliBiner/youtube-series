package com.jd.ders22;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // String[] studentName = new String[10];
        // String[] studentLastName = new String[10];
        // String[] studentID = new String[10];
        // String[] studentDepertmant = new String[10];
        // String[] studentGender = new String[10];
        // Date[] studentBirthDate = new Date[10];
        // double[] studentAverage = new double[10];
        // int[] studentGrade = new int[10];


        // for(int i=0; i<studentName.length; i++){
        //     System.out.println("Öğrenci Adını Giriniz: ");
        //     studentName[i] = scanner.nextLine();


        //     System.out.println("Öğrenci Soyadını Giriniz: ");
        //     studentLastName[i] = scanner.nextLine();
        // }

        
        Student[] students = new Student[2];

        for(int i = 0; i<students.length; i++){
            System.out.println( (i+1) + ". Öğrenci Bilgileri ");
            students[i] = new Student();

            System.out.println("Öğrenci Adını Giriniz: ");
            students[i].name = scanner.nextLine();

            System.out.println("Öğrenci Soyadı Giriniz: ");
            students[i].lastName = scanner.nextLine();  
            
            System.out.println("Öğrenci tc Giriniz: ");
            students[i].id = scanner.nextLine();

            System.out.println("Öğrenci bölüm Giriniz: ");
            students[i].depertmant = scanner.nextLine();

            System.out.println("Öğrenci cinsiyet Giriniz: ");
            students[i].gender = scanner.nextLine();

            System.out.println("Öğrenci doğum tarihi Giriniz: ");
            students[i].birthDate = scanner.nextLine();

            System.out.println("Öğrenci sınıf Giriniz: ");
            students[i].grade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Öğrenci doğum yeri Giriniz: ");
            students[i].birthPlace = scanner.nextLine();

        }

        System.out.print("Aramak istdiğiniz öğrenci adı: ");
        String studentName = scanner.nextLine();

        for(int i=0; i<students.length; i++){
            if(students[i].name.equals(studentName)){
                System.out.println(students[i]);
            }
        }
    
    }
}
