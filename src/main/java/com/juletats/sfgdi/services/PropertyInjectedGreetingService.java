package com.juletats.sfgdi.services;

import org.springframework.stereotype.Service;

public class PropertyInjectedGreetingService implements  GreetingService{
public String sayGreeting(){
    return "Hello world! - Property";
}
}
