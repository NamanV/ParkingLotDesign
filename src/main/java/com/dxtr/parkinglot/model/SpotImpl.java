package com.dxtr.parkinglot.model;

import com.dxtr.parkinglot.model.interfaces.Spot;
import com.dxtr.parkinglot.model.interfaces.Vehicle;
import com.dxtr.parkinglot.utility.EnumUtility;
import com.dxtr.parkinglot.utility.ParkingLotException;

/**
 * Created by Naman on 3/13/19.
 */
public class SpotImpl implements Spot {

    private Vehicle vehicle;
    private int spotNumber;
    private boolean empty = false;

    @Override
    public void initSpot() {

    }

    @Override
    public void vacateSpot() {
        this.empty = true;
    }

    @Override
    public void fillSpot() {
        this.empty = false;
    }

    @Override
    public void assignVehicle(Vehicle vehicle) throws ParkingLotException {
        if (empty) {
            this.vehicle = vehicle;
            fillSpot();
        }

        throw ParkingLotException.builder().errorMessage(EnumUtility.CODES.NOT_EMPTY.getMessage())
                .errorCode(EnumUtility.CODES.NOT_EMPTY.getCode()).build();
    }


    @Override
    public Vehicle exitVehicle() throws ParkingLotException {
        if (empty) {
            throw ParkingLotException.builder().errorMessage(EnumUtility.CODES.EMPTY_SPOT.getMessage())
                    .errorCode(EnumUtility.CODES.EMPTY_SPOT.getCode()).build();
        }

        Vehicle tempVehicle = vehicle;
        vehicle = null;
        return tempVehicle;
    }
}
