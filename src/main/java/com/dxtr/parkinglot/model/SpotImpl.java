package com.dxtr.parkinglot.model;

import com.dxtr.parkinglot.model.interfaces.Spot;
import com.dxtr.parkinglot.model.interfaces.Vehicle;

/**
 * Created by Naman on 3/13/19.
 */
public class SpotImpl implements Spot{

    private Vehicle vehicle;
    private int spotNumber;
    private boolean empty;

}
