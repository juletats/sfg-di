package com.juletats.sfgdi.controllers;

import com.juletats.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setIp(){
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}