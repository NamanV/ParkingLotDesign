package com.dxtr.parkinglot.service;

import com.dxtr.parkinglot.api.request.ParkingRequest;
import com.dxtr.parkinglot.api.response.ParkingResponse;
import com.dxtr.parkinglot.model.VehicleImpl;
import com.dxtr.parkinglot.model.interfaces.ParkingLot;
import com.dxtr.parkinglot.model.interfaces.Vehicle;
import com.dxtr.parkinglot.repository.VehicleRepository;
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

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public ParkingResponse parkVehicle(ParkingRequest parkingRequest) throws ParkingLotException {
        Vehicle vehicle = VehicleImpl.builder().licencePlate(parkingRequest.getLicencePlate()).size(parkingRequest.getSize()).build();
        parkingLot.parkVehicle(vehicle);
        vehicleRepository.addVehicle(vehicle);
        return ParkingResponse.builder().build();
    }

    @Override
    public boolean isParkingFull() throws ParkingLotException {
        return parkingLot.availableParkingSpot() == 0;
    }

    @Override
    public int availableSpots() throws ParkingLotException {
        return parkingLot.availableParkingSpot();
    }

    @Override
    public ParkingResponse exitVehicle(ParkingRequest parkingRequest) throws ParkingLotException {
        return null;
    }
}
