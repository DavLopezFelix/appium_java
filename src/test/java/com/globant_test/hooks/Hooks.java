package com.globant_test.hooks;

import com.globant_test.config.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Abriendo la aplicación...");
        DriverFactory.getDriver();
    }

    @After(order = 2)
    public static void takeScreenshot(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Smile...taking a picture");
            TakesScreenshot takesScreenShot = (TakesScreenshot) DriverFactory.getDriver();
            byte [] screenshot = takesScreenShot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", screenshot.toString());
        }
    }
    @After(order = 1)
    public void tearDown(){
        DriverFactory.quitDriver();
        System.out.println("Aplicacion cerrada!");

    }
}
