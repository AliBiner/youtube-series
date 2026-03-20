package com.jd.ders21_30.ders26.vehicle;

public class Vehicle {
    private String brand;
    private String model;
    private double rentalPrice;

    public Vehicle(String brand, String model, double rentalPrice) {
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }


    public double calculateCost(int days){
        return rentalPrice * days;
    }


    public String getInfo() {
        return "Vehicle [brand=" + brand + ", model=" + model + ", rentalPrice=" + rentalPrice + "]";
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public double getRentalPrice() {
        return rentalPrice;
    }


    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    
    
}
