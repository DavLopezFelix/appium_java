package com.globant_test.hooks;

import com.globant_test.config.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Abriendo la aplicación...");
        DriverFactory.getDriver();
    }

    @After
    public void tearDown(){
        DriverFactory.quitDriver();
        System.out.println("Aplicacion cerrada!");

    }
}
