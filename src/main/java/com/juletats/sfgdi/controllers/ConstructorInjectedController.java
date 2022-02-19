package com.juletats.sfgdi.controllers;

import com.juletats.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;
    //no need in autowired because of constructor
    public  ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService){
        this.greetingService=greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
