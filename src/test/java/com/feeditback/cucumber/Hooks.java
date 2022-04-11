package com.feeditback.cucumber;

import com.cucumber.listener.Reporter;
import com.feeditback.propertyreader.PropertyReader;
import com.feeditback.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


public class Hooks extends Utility {


    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Deena");
    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
          String screenShotPath =  Utility.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       closeBrowser();
    }
}
