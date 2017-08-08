package com.kodedu.rentacar;

import org.springframework.stereotype.Component;

@Component
public class Honda implements Vehicle {

    @Override
    public double getDailyPrice() {
        System.out.println(this.getClass().getSimpleName());
        return 200;
    }
}
