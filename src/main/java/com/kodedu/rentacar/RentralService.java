package com.kodedu.rentacar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RentralService {

    private Vehicle vehicle;


    @Autowired
    public RentralService(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }


    public void rent(int days)
    {
      double total =  vehicle.getDailyPrice() * days ;
        System.out.println(total);
    }
}
