package Activity;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    // Driver Declaration
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAppPackage("com.coloros.calculator");
        options.setDeviceName("realme 8s 5G");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.setAutomationName("UiAutomator2");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }

    // Test method
    @Test()
    public void additionTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("Add")).click();
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_9")).click();
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();

        // Find the result
        String result = driver.findElement(AppiumBy.id("com.coloros.calculator:id/result")).getText();

        // Assertion
        Assert.assertEquals(result, "14");
    }

    // Test method
    @Test
    public void subtractTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_1")).click();
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("Subtract")).click();
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();

        // Find the result
        String result = driver.findElement(AppiumBy.id("com.coloros.calculator:id/result")).getText();

        // Assertion
        Assert.assertEquals(result, "5");
    }

    // Test method
    @Test
    public void multiplyTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("Multiply")).click();
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_1")).click();
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_0")).click();
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();

        // Find the result
        String result = driver.findElement(AppiumBy.id("com.coloros.calculator:id/result")).getText();

        // Assertion
        Assert.assertEquals(result, "500");
    }

    // Test method
    @Test
    public void divideTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_5")).click();
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("Divide")).click();
        driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_2")).click();
        driver.findElement(AppiumBy.accessibilityId("Equals")).click();

        // Find the result
        String result = driver.findElement(AppiumBy.id("com.coloros.calculator:id/result")).getText();

        // Assertion
        Assert.assertEquals(result, "25");
    }

    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
