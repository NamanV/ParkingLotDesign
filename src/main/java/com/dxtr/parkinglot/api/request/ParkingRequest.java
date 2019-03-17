package com.dxtr.parkinglot.api.request;

import com.dxtr.parkinglot.utility.EnumUtility;
import lombok.Getter;

/**
 * Created by Naman on 3/17/19.
 */

@Getter
public class ParkingRequest {

    private String licencePlate;
    private EnumUtility.Size size;
}
