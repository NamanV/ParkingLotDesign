package com.dxtr.parkinglot.utility;

import lombok.Builder;
import com.dxtr.parkinglot.api.response.Error;
import lombok.Getter;

/**
 * Created by Naman on 3/13/19.
 */

@Builder
@Getter
public class ParkingLotException extends Exception {

    private int errorCode;
    private String errorMessage;


    public static Error error(ParkingLotException e) {
        return Error.builder().errorCode(e.getErrorCode()).errorMessage(e.getErrorMessage()).build();
    }

}
