package com.dxtr.parkinglot.utility;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Naman on 3/13/19.
 */
public class EnumUtility {

    public enum Size {
        SMALL(1), MEDIUM(2), LARGE(4);

        int noOfSpotsRequired;

        Size(int noOfSpotsRequired){
            this.noOfSpotsRequired = noOfSpotsRequired;
        }
    }


    @Getter
    public enum CODES {
        NOT_EMPTY(100, "Dude, spot is not empty. You will crash into parked car!!!!"),
        EMPTY_SPOT(101, "No vehicle is parked here, we can't magically generate one for you. Try the spot wher you parked your vehicle!!!");

        int code;
        String message;

        CODES(int code, String message) {
            this.code = code;
            this.message = message;
        }

    }
}
