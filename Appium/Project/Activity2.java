package LiveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2 {

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUP() throws MalformedURLException
    {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setPlatformName("android");
        options.setDeviceName("realme 8s 5G");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity("com.google.android.apps.keep.ui.activities.BrowseActivity");
        options.setAutomationName("UiAutomator2");
        options.noReset();

        URL serverURL= new URL("http://localhost:4723/wd/hub");

        //driver initialization

        driver= new AndroidDriver(serverURL,options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    public void addNote() {


        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("New text note")));


        driver.findElement(AppiumBy.accessibilityId("New text note")).click();

        //wait.until(ExpectedConditions.textToBePresentInElement())
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/editable_title")));

        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("FST Appium");


        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("Comple Activities by 07-07-2022");

        driver.findElement(AppiumBy.accessibilityId("Open navigation drawer")).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/open_search_bar_text_view")));

        String title= driver.findElement(AppiumBy.xpath("(//androidx.cardview.widget.CardView[@content-desc=\"FST Appium. Comple Activities by 07-07-2022. \"])[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]")).getText();

        System.out.println("The Note Ttle is "+title);

        Assert.assertEquals(title,"FST Appium");

        String note= driver.findElement(AppiumBy.xpath("(//androidx.cardview.widget.CardView[@content-desc=\"FST Appium. Comple Activities by 07-07-2022. \"])[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]")).getText();

        System.out.println("The Note  is "+note);
        Assert.assertEquals(note,"Comple Activities by 07-07-2022");


    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
