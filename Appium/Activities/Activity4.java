package Activity;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity4 {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "realme 5");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.contacts");
        caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(appServer, caps);
        wait= new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    @Test
    public void createNewContact() {

        //wait.until(ExpectedConditions.elementToBeClickable((MobileBy.id("fab"))));
        driver.findElement(AppiumBy.accessibilityId("Create contact")).click();

        //driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.viewpager.widget.b/android.view.ViewGroup/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[9]/android.widget.RelativeLayout")).click();
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Adithyaa");
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("Varmaa");
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")).sendKeys("999148292");
        // Click Save
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.Button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.contacts:id/large_title")));

        // Assertion
        String contactName = driver.findElement(AppiumBy.id("com.google.android.contacts:id/large_title")).getText();
        Assert.assertEquals(contactName, "Adithyaa Varmaa");
    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
       // driver.quit();
    }
}