package com.dxtr.parkinglot.repository;

import com.dxtr.parkinglot.model.interfaces.Vehicle;
import com.dxtr.parkinglot.utility.ParkingLotException;
import org.springframework.stereotype.Repository;

/**
 * Created by Naman on 3/17/19.
 */

@Repository
public interface VehicleRepository {

    void addVehicle(Vehicle vehicle) throws ParkingLotException;

    void removeVehicle(Vehicle vehicle) throws ParkingLotException;
}
