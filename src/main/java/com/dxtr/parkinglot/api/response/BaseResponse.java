package com.dxtr.parkinglot.api.response;

import lombok.*;

import java.io.Serializable;

/**
 * Created by Naman on 3/17/19.
 */

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BaseResponse implements Serializable {

    private boolean success = true;
    private String message;
    private Error error;

}
