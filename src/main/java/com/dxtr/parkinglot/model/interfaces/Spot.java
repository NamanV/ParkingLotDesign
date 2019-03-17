package com.dxtr.parkinglot.model.interfaces;

import com.dxtr.parkinglot.utility.ParkingLotException;

/**
 * Created by Naman on 3/13/19.
 */
public interface Spot {
    void initSpot();
    void fillSpot();
    void vacateSpot();

    void assignVehicle(Vehicle vehicle) throws ParkingLotException;

    Vehicle exitVehicle() throws  ParkingLotException;

}
