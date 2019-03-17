package com.dxtr.parkinglot.api.response;

import lombok.Builder;

/**
 * Created by Naman on 3/17/19.
 */
@Builder
public class Error {
    private int errorCode;
    private String errorMessage;
}
