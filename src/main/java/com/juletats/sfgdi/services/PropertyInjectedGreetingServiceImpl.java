package com.juletats.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements  GreetingService{
public String sayGreeting(){
    return "Hello world! - Property";
}
}
