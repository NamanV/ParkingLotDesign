package com.dxtr.parkinglot.model;

import com.dxtr.parkinglot.model.interfaces.Floor;
import com.dxtr.parkinglot.model.interfaces.Row;
import com.dxtr.parkinglot.utility.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naman on 3/13/19.
 */
public class FloorImpl implements Floor {
    private List<Row> rows;

    @Override
    public void initFloor() {
        rows = new ArrayList<>(Configuration.ROWS_IN_A_FLOOR);
        for (int i = 0; i < Configuration.ROWS_IN_A_FLOOR; i++) {
            Row row = new RowImpl();
            row.initRow();
            rows.add(row);
        }
    }
}
