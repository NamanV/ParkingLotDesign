package com.dxtr.parkinglot.model;

import com.dxtr.parkinglot.model.interfaces.Row;
import com.dxtr.parkinglot.model.interfaces.Spot;
import com.dxtr.parkinglot.utility.Configuration;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naman on 3/13/19.
 */
public class RowImpl implements Row {
    List<Spot> spots;

    @Override
    public void initRow() {
        spots = new ArrayList<>(Configuration.SLOTS_IN_A_ROW);
        for (int i = 0; i < Configuration.SLOTS_IN_A_ROW; i++) {
            Spot spot = new SpotImpl();
            spot.initSpot();
            spots.add(spot);
        }
    }
}
