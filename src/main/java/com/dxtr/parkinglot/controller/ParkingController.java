package com.dxtr.parkinglot.controller;

import com.dxtr.parkinglot.api.request.ParkingRequest;
import com.dxtr.parkinglot.api.response.ParkingResponse;
import com.dxtr.parkinglot.model.VehicleImpl;
import com.dxtr.parkinglot.model.interfaces.Vehicle;
import com.dxtr.parkinglot.service.ParkingLotService;
import com.dxtr.parkinglot.utility.ParkingLotException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Naman on 3/17/19.
 */
@RestController(value = "/parking")
public class ParkingController {

    @Autowired
    ParkingLotService parkingLotService;

    @RequestMapping(value = "/park")
    public ResponseEntity<ParkingResponse> parkVehicle(@RequestBody ParkingRequest parkingRequest) {
        ParkingResponse parkingResponse;
        try {
            parkingResponse = parkingLotService.parkVehicle(parkingRequest);
        } catch (ParkingLotException e) {
            parkingResponse = ParkingResponse.builder().build();
            parkingResponse.setError(ParkingLotException.error(e));
            parkingResponse.setSuccess(false);
        }
        return new ResponseEntity<>(parkingResponse, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/exit")
    public ResponseEntity<ParkingResponse> exitVehicle(@RequestBody ParkingRequest parkingRequest) {
        ParkingResponse parkingResponse;
        try {
            parkingResponse = parkingLotService.exitVehicle(parkingRequest);
        } catch (ParkingLotException e) {
            parkingResponse = ParkingResponse.builder().build();
            parkingResponse.setError(ParkingLotException.error(e));
            parkingResponse.setSuccess(false);
        }
        return new ResponseEntity<>(parkingResponse, HttpStatus.FOUND);
    }

    @RequestMapping(value = "/full")
    public ResponseEntity<?> isParkingFull() {
        return null;
    }

    @RequestMapping(value = "/free-spot")
    public ResponseEntity<?> availableSpots() {
        return null;
    }


}
