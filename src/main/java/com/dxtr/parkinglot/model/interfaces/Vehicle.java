package com.dxtr.parkinglot.model.interfaces;

import com.dxtr.parkinglot.utility.EnumUtility;
import com.dxtr.parkinglot.utility.ParkingLotException;

/**
 * Created by Naman on 3/13/19.
 */
public interface Vehicle {

    EnumUtility.Size getSize();
    String getLicencePlate();
    void vacateSpot();

    Spot parkVehicle() throws ParkingLotException;
}
