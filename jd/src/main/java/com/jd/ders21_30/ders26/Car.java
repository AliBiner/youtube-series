package com.jd.ders21_30.ders26;

public class Car {
    private String brand;
    private String model;
    private double rentalPrice;
    private int engineCC;
    private String fuelType;
    private int numDoors;
    private boolean isAutomatic;

    public Car(String brand, int engineCC, String fuelType, boolean isAutomatic, String model, int numDoors, double rentalPrice) {
        this.brand = brand;
        this.engineCC = engineCC;
        this.fuelType = fuelType;
        this.isAutomatic = isAutomatic;
        this.model = model;
        this.numDoors = numDoors;
        this.rentalPrice = rentalPrice;
    }

    public double calculateCost(int days){
        return rentalPrice * days / 2;
    }

    public void refuel(){
        System.out.println("Refuel is complete");
    }


    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", rentalPrice=").append(rentalPrice);
        sb.append(", engineCC=").append(engineCC);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", numDoors=").append(numDoors);
        sb.append(", isAutomatic=").append(isAutomatic);
        sb.append('}');
        return sb.toString();
    }

    
}
