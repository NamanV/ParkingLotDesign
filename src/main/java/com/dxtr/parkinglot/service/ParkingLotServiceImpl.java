package com.dxtr.parkinglot.service;

import com.dxtr.parkinglot.api.request.ParkingRequest;
import com.dxtr.parkinglot.api.response.ParkingResponse;
import com.dxtr.parkinglot.model.interfaces.ParkingLot;
import com.dxtr.parkinglot.utility.ParkingLotException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Naman on 3/17/19.
 */

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    @Autowired
    private ParkingLot parkingLot;

    @Override
    public ParkingResponse parkVehicle(ParkingRequest parkingRequest) throws ParkingLotException {
        return null;
    }

    @Override
    public boolean isParkingFull() throws ParkingLotException {
        return false;
    }

    @Override
    public int availableSpots() throws ParkingLotException {
        return 0;
    }

    @Override
    public ParkingResponse exitVehicle(ParkingRequest parkingRequest) throws ParkingLotException {
        return null;
    }
}
