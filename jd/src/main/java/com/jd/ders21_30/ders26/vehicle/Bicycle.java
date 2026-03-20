package com.jd.ders21_30.ders26.vehicle;

public class Bicycle extends NonMotorizedVehicle {

    private String bikeType;
    private boolean hasElecticAssist;
    
    public Bicycle(String brand, String model, double rentalPrice, int gearCount) {
        super(brand, model, rentalPrice, gearCount);
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public boolean isHasElecticAssist() {
        return hasElecticAssist;
    }

    public void setHasElecticAssist(boolean hasElecticAssist) {
        this.hasElecticAssist = hasElecticAssist;
    }

}
