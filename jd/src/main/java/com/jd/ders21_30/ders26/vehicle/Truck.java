package com.jd.ders21_30.ders26.vehicle;

public class Truck extends MotorizedVehicle {

    private double payloadTons;
    private boolean hasTrailer;

    public Truck(String brand, String model, double rentalPrice, int engineCC, String fuelType) {
        super(brand, model, rentalPrice, engineCC, fuelType);
        //TODO Auto-generated constructor stub
    }

    public double getPayloadTons() {
        return payloadTons;
    }

    public void setPayloadTons(double payloadTons) {
        this.payloadTons = payloadTons;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    

}
