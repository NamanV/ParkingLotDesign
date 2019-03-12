package com.dxtr.parkinglot.model;

import com.dxtr.parkinglot.model.interfaces.Vehicle;
import com.dxtr.parkinglot.utility.EnumUtility;

/**
 * Created by Naman on 3/13/19.
 */
public class VehicleImpl implements Vehicle {

    private EnumUtility.Size size;
    private String licencePlate;


    @Override
    public EnumUtility.Size getSize() {
        return this.size;
    }

    @Override
    public String getLicencePlate() {
        return this.licencePlate;
    }
}
