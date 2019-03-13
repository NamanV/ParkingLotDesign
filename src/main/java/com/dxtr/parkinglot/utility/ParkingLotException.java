package com.dxtr.parkinglot.utility;

import lombok.Builder;

/**
 * Created by Naman on 3/13/19.
 */

@Builder
public class ParkingLotException extends Exception {

    private int errorCode;
    private String errorMessage;


}
