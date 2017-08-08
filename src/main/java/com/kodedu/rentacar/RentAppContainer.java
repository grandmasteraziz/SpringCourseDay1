package com.kodedu.rentacar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RentAppContainer {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:rent-config.xml");

    RentralService rentralService = applicationContext.getBean(RentralService.class);




}
