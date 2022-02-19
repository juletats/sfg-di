package com.juletats.sfgdi.controllers;

import com.juletats.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setIp(){
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}