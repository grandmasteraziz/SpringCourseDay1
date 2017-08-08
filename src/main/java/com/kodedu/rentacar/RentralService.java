package com.kodedu.rentacar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RentralService {



    private Vehicle vehicle;

    public RentralService()
    {

    }

    @Autowired
    public RentralService(@Qualifier("Honda") Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }


    public void rent(int days)
    {
      double total =  vehicle.getDailyPrice() * days ;
        System.out.println(total);
    }
}
