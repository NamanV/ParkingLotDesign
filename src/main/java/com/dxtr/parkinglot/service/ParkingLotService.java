package com.dxtr.parkinglot.service;

import com.dxtr.parkinglot.api.request.ParkingRequest;
import com.dxtr.parkinglot.api.response.ParkingResponse;
import com.dxtr.parkinglot.utility.ParkingLotException;

/**
 * Created by Naman on 3/17/19.
 */
public interface ParkingLotService {


    ParkingResponse parkVehicle(ParkingRequest parkingRequest) throws ParkingLotException;

    ParkingResponse exitVehicle(ParkingRequest parkingRequest) throws ParkingLotException;

    int availableSpots() throws ParkingLotException;

    boolean isParkingFull() throws ParkingLotException;

}
