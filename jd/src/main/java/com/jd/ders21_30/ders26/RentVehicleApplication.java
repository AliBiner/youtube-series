package com.jd.ders21_30.ders26;

import com.jd.ders21_30.ders26.vehicle.Car;
import com.jd.ders21_30.ders26.vehicle.MotorizedVehicle;
import com.jd.ders21_30.ders26.vehicle.Vehicle;

public class RentVehicleApplication {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Audi", "A7", 1000);

        String vehicleInfo = vehicle.getInfo();
        System.out.println(vehicleInfo);
        System.out.println("Kiralama Bedeli:" + vehicle.calculateCost(7));
        System.out.println("----------------------");

        MotorizedVehicle motorizedVehicle = new MotorizedVehicle("BMW", "İ7", 2000, 1400, "Benzin");

        String motorizedInfo = motorizedVehicle.getInfo();
        System.out.println(motorizedInfo);
        motorizedVehicle.refuel();
        System.out.println("Kiralama Bedeli: " + motorizedVehicle.calculateCost(7));
        System.out.println("----------------------");

        Car car = new Car("Volvo", "", 5000, 1000, "Dizel");

        String carInfo = car.getInfo();
        System.out.println(carInfo);
        car.refuel();
        System.out.println("Kiralama Bedeli: " + car.calculateCost(7));
        System.out.println("----------------------");


        Car car2 = new Car("Volvo", "", 5000, 1000, "Dizel");
        car2.setNumDoors(5);
        String carInfo2 = car2.getInfo();
        System.out.println(carInfo2);
        car2.refuel();
        System.out.println("Kiralama Bedeli: " + car2.calculateCost(7));
        System.out.println("----------------------");

    }
}
