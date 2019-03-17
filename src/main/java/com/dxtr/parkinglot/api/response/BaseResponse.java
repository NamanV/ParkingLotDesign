package com.dxtr.parkinglot.api.response;

import lombok.Builder;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Naman on 3/17/19.
 */

@Builder
@Setter
public class BaseResponse implements Serializable {

    private boolean success;
    private String message;
    private Error error;

}
