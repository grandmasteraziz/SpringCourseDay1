package com.kodedu.rentacar;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Honda")
public interface Vehicle {

    double getDailyPrice();
}
