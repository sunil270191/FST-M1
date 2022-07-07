package Activity;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {

    //Driver Declaration
    AndroidDriver driver;
//Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        //Desired capabilities
        UiAutomator2Options options =new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAppPackage("com.coloros.calculator");
        options.setDeviceName("realme 8s 5G");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.setAutomationName("UiAutomator2");
        options.noReset();
// Server URL
        URL serverURL= new URL("http://localhost:4723/wd/hub");

        //driver initialization

        driver= new AndroidDriver(serverURL,options);
    }
// Test method
    @Test
    public void multiplyTest()
    {
        //find and click 5
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_5")).click();
        //find and click *
        driver.findElement(AppiumBy.accessibilityId("Multiply")).click();
        //find and click 8
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_8")).click();
        //find and click =
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();

        //Getting result of operation

        String result=driver.findElement(AppiumBy.id("com.coloros.calculator:id/result")).getText();

        System.out.println("The Result is : "+result);

        //Assertion

        Assert.assertEquals(result,"40");

    }
    //Tear down method

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
