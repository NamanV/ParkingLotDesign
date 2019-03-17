package com.dxtr.parkinglot.application;

import com.dxtr.parkinglot.model.VehicleImpl;
import com.dxtr.parkinglot.model.interfaces.ParkingLot;
import com.dxtr.parkinglot.model.interfaces.Vehicle;
import com.dxtr.parkinglot.utility.EnumUtility;
import com.dxtr.parkinglot.utility.ParkingLotException;

/**
 * Created by Naman on 3/17/19.
 */
public class Tester {

    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLotImpl();
        parkingLot.initParkingLot();

        Vehicle vehicle = VehicleImpl.builder().licencePlate("KA 03 NC 3112").size(EnumUtility.Size.MEDIUM).build();

        try {
            parkingLot.parkVehicle(vehicle);
        } catch (ParkingLotException e) {

        }

        vehicle = VehicleImpl.builder().licencePlate("UP81 AL4772").size(EnumUtility.Size.SMALL).build();

        try {
            parkingLot.parkVehicle(vehicle);
        } catch (ParkingLotException e) {

        }


    }
}
