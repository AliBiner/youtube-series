package com.jd.ders21_30.ders26.vehicle;

public class Car extends MotorizedVehicle  {
    private int numDoors;
    private boolean isAutomatic;

    public Car(String brand, String model, double rentalPrice, int engineCC, String fuelType) {
        super(brand, model, rentalPrice, engineCC, fuelType);
    }
    

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

}
