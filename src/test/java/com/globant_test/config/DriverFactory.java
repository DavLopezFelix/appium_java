package com.globant_test.config;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class DriverFactory {
    protected static AppiumDriver driver;

    public static AppiumDriver getDriver(){
        if(driver == null){
            try{
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("appium:deviceName", "Medium Phone API 35");
                cap.setCapability("platformName", "Android");
                cap.setCapability("appium:platformVersion", "15");
                cap.setCapability("appium:automationName", "UiAutomator2");
                cap.setCapability("appium:appPackage", "com.wdiodemoapp");
                cap.setCapability("appium:appActivity", "com.wdiodemoapp.MainActivity");
                cap.setCapability("appium:udid", "emulator-5554");

                driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), cap);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    public static WebDriverWait getWait(){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }
}

