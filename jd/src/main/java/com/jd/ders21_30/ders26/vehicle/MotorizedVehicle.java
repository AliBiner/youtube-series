package com.jd.ders21_30.ders26.vehicle;

public class MotorizedVehicle extends Vehicle {

    private int engineCC;
    private String fuelType;

    public MotorizedVehicle(String brand, String model, double rentalPrice, int engineCC, String fuelType) {
        super(brand, model, rentalPrice);
        this.engineCC = engineCC;
        this.fuelType = fuelType;
    }

    

    @Override
    public String getInfo() {
        return "Motorized Vehicle { brand: " + this.getBrand() + " model: " + this.getModel() + " rentalPrice: " + this.getRentalPrice() + " engineCC: " + this.engineCC + " fuelType: " + this.fuelType;
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
