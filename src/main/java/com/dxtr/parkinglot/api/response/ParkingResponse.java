package com.dxtr.parkinglot.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Setter;

/**
 * Created by Naman on 3/17/19.
 */

@Builder
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParkingResponse extends BaseResponse {

}
