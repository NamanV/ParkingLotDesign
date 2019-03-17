package com.dxtr.parkinglot.repository;

import com.dxtr.parkinglot.model.interfaces.Spot;
import com.dxtr.parkinglot.model.interfaces.Vehicle;
import com.dxtr.parkinglot.utility.EnumUtility;
import com.dxtr.parkinglot.utility.ParkingLotException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Naman on 3/17/19.
 */
public class VehicleDAO implements VehicleRepository {


    private static Map<String, Vehicle> VEHICLE_MAP = new HashMap<>();
    private static Map<String, List<Spot>> VEHICLE_TO_SPOT_MAP = new HashMap<>();

    @Override
    public void addVehicle(Vehicle vehicle) throws ParkingLotException {
        VEHICLE_MAP.put(vehicle.getLicencePlate(), vehicle);
    }

    @Override
    public void removeVehicle(Vehicle vehicle) throws ParkingLotException {
        VEHICLE_MAP.remove(vehicle.getLicencePlate());
    }
}
