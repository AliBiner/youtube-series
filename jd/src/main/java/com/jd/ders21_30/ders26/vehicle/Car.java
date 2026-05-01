package com.jd.ders21_30.ders26.vehicle;

public class Car extends MotorizedVehicle {
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
        if (this.numDoors <= 0) {
            return super.calculateCost(days);
        } else {
            return days * this.getRentalPrice() * this.numDoors;
        }
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numDoors;
        result = prime * result + (isAutomatic ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (numDoors != other.numDoors)
            return false;
        if (isAutomatic != other.isAutomatic)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Car [numDoors=" + numDoors + ", isAutomatic=" + isAutomatic + ", getInfo()=" + getInfo()
                + ", getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", getEngineCC()=" + getEngineCC()
                + ", getRentalPrice()=" + getRentalPrice() + ", getNumDoors()=" + getNumDoors() + ", getFuelType()="
                + getFuelType() + ", isAutomatic()=" + isAutomatic() + "]";
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
