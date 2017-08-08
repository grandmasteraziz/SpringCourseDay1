package com.kodedu.rentacar;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Honda")
public class Honda implements Vehicle {

    @Override
    public double getDailyPrice() {
        System.out.println(this.getClass().getSimpleName());
        return 200;
    }
}
