package com.driver;

public class Boat implements  WaterVehicle{
    private   String vehiclename;
    private int vehicleCapacity;

    public Boat(String vehiclename, int vehicleCapacity) {
        this.vehiclename = vehiclename;
        this.vehicleCapacity = vehicleCapacity;
    }

    @Override
    public String getVehicleName() {
        return vehiclename;
    }

    @Override
    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

}
