package Activity;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2
{
    WebDriverWait wait;
    AndroidDriver driver = null;

    @BeforeClass
    public void setup() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testSearchAppium() {
        // Open page in browser
        driver.get("https://www.training-support.net/");

        // Wait for page to load
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("About Us")));

        // Get heading on page and print it
        String pageTitle = driver
                .findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']"))
                .getText();
        System.out.println("Title on Homepage: " + pageTitle);

        // Find About Us button and click it
        WebElement aboutButton = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='About Us']"));
        aboutButton.click();

        // Wait for new page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                MobileBy.xpath("//android.widget.TextView[@text='About Us']")
        ));

        // Get heading on About Us page and print it
        String newPageTitle = driver
                .findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']"))
                .getText();
        System.out.println("Title on new page: " + newPageTitle);

        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
