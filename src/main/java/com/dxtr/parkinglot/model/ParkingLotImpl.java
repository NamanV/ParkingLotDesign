package com.dxtr.parkinglot.model;

import com.dxtr.parkinglot.model.interfaces.Floor;
import com.dxtr.parkinglot.model.interfaces.ParkingLot;
import com.dxtr.parkinglot.model.interfaces.Vehicle;
import com.dxtr.parkinglot.utility.Configuration;
import com.dxtr.parkinglot.utility.ParkingLotException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naman on 3/14/19.
 */

public class ParkingLotImpl implements ParkingLot {

    private List<Floor> floors;

    public void initParkingLot() {
        this.floors = new ArrayList<>();
        for (int i = 0; i < Configuration.FLOORS_IN_A_LOT; i++) {
            Floor floor = new FloorImpl();
            floor.initFloor();
            floors.add(floor);
        }
    }

    @Override
    public void parkVehicle(Vehicle vehicle) throws ParkingLotException {

    }

    @Override
    public void vacateSpot() throws ParkingLotException {

    }


    @Override
    public int availableParkingSpot() {
        return -1;
    }
}
