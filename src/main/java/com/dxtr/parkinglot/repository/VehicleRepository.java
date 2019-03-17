package com.dxtr.parkinglot.repository;

import com.dxtr.parkinglot.model.interfaces.Vehicle;
import com.dxtr.parkinglot.utility.ParkingLotException;

/**
 * Created by Naman on 3/17/19.
 */

public interface VehicleRepository {

    void addVehicle(Vehicle vehicle) throws ParkingLotException;

    void removeVehicle(Vehicle vehicle) throws ParkingLotException;
}
