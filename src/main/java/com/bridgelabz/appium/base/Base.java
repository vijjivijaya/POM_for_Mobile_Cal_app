package com.bridgelabz.appium.base;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;

public class Base {
    public static AndroidDriver driver;
    
    @BeforeTest
    
    public void launchEmulator() throws MalformedURLException {
   
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName","emulator-5554");
	cap.setCapability("platformName","Android");
	cap.setCapability("platformVersion","8.1");
	cap.setCapability("appPackage","com.android.calculator2");
    cap.setCapability("appActivity","com.android.calculator2.Calculator");
    
    driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
    System.out.println("Device time :" + driver.getDeviceTime());
    System.out.println("BeforeTest passed application launched sucessfully");
}


}
