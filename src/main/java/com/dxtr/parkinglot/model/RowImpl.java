package com.dxtr.parkinglot.model;

import com.dxtr.parkinglot.model.interfaces.Row;
import com.dxtr.parkinglot.model.interfaces.Spot;

import java.util.List;

/**
 * Created by Naman on 3/13/19.
 */
public class RowImpl implements Row {
    List<Spot> spots;
}
