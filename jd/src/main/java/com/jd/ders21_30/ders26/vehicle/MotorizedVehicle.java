package com.jd.ders21_30.ders26.vehicle;

public class MotorizedVehicle extends Vehicle {

    private int engineCC;
    private String fuelType;

    public MotorizedVehicle(String brand, String model, double rentalPrice, int engineCC, String fuelType) {
        super(brand, model, rentalPrice);
        this.engineCC = engineCC;
        this.fuelType = fuelType;
    }


    public void refuel(){
        System.out.println("Refuel is compelete");
    }


    public int getEngineCC() {
        return engineCC;
    }


    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }


    public String getFuelType() {
        return fuelType;
    }


    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    

}
