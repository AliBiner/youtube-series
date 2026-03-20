package com.jd.ders21_30.ders26.vehicle;

public class NonMotorizedVehicle extends Vehicle {
    private int gearCount;

    public NonMotorizedVehicle(String brand, String model, double rentalPrice, int gearCount) {
        super(brand, model, rentalPrice);
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    
    

}
