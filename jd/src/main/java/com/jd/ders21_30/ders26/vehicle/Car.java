package com.jd.ders21_30.ders26.vehicle;

public class Car extends MotorizedVehicle  {
    private int numDoors;
    private boolean isAutomatic;

    public Car(String brand, String model, double rentalPrice, int engineCC, String fuelType) {
        super(brand, model, rentalPrice, engineCC, fuelType);
    }
    
    

    @Override
    public String getInfo() {
        return "Car { brand: " + this.getBrand() + " model: " + this.getModel() + " rentalPrice: "
                + this.getRentalPrice() + " engineCC: " + this.getEngineCC() + " fuelType: " + this.getFuelType();
    }

    

    @Override
    public double calculateCost(int days) {
        if (this.numDoors<=0) {
            return super.calculateCost(days);
        }else{
            return days * this.getRentalPrice() * this.numDoors;
        }
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
