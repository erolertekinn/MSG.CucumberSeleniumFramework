package com.msg.step_definitions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.msg.utilities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            final byte[] screenschot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenschot, "image/png", "screenshot");
        }
        Driver.closeDriver();

    }

    @Before("@db")
    public void setUpdb(){
        System.out.println("\tconnecting to database...");
    }

    @After("@db")
    public void closeDb(){
        System.out.println("\tdisconnecting to database...");

    }



}