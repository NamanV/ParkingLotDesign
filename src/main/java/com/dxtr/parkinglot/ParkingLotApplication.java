package com.dxtr.parkinglot;

import com.dxtr.parkinglot.model.ParkingLotImpl;
import com.dxtr.parkinglot.model.interfaces.ParkingLot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class ParkingLotApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkingLotApplication.class, args);
    }


    @Bean
    public ParkingLot initParkingLot() {
        ParkingLot parkingLot = new ParkingLotImpl();
        parkingLot.initParkingLot();
        return parkingLot;
    }

}
