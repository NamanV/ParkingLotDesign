package com.dxtr.parkinglot.utility;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Naman on 3/13/19.
 */
public class EnumUtility {

    public enum Size {
        SMALL, MEDIUM, LARGE;

        int noOfSpotsRequired;
    }


    @Getter
    public enum CODES {
        NOT_EMPTY(100, "Spot is not empty. You crashed into parked car!!!!"),
        EMPTY_SPOT(101, "No vehicle is parked here, we can't magically generate one for you. Try your spot!!!");

        int code;
        String message;

        CODES(int code, String message) {
            this.code = code;
            this.message = message;
        }

    }
}
