package com.kodedu.rentacar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RentAppContainer {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:rent-config.xml");

        RentralService rentralService = applicationContext.getBean(RentralService.class);
        rentralService.rent(4);
    }


}
