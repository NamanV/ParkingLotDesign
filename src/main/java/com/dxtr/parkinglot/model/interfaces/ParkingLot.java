package com.dxtr.parkinglot.model.interfaces;

import com.dxtr.parkinglot.utility.ParkingLotException;

/**
 * Created by Naman on 3/17/19.
 */
public interface ParkingLot {

    void initParkingLot();

    void parkVehicle(Vehicle vehicle) throws ParkingLotException;

    void vacateSpot() throws ParkingLotException;
}
