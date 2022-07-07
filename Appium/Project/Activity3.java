package LiveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activity3 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUP() throws MalformedURLException
    {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setPlatformName("android");
        options.setDeviceName("realme 8s 5G");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.setAutomationName("UiAutomator2");
        options.noReset();

        URL serverURL= new URL("http://localhost:4723/wd/hub");

        //driver initialization

        driver= new AndroidDriver(serverURL,options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void scrollTask() throws InterruptedException {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator(UiScrollable + ".flingForward()"));
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"To-Do List \uF0AE Elements get added at run time\"]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']")));
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@resource-id, 'taskInput')]")).sendKeys("Add tasks to list");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains (@text,'Add Task')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@resource-id,'taskInput')]")).sendKeys("Get number of tasks");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains (@text,'Add Task')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[contains (@resource-id,'taskInput')]")).sendKeys("Clear the list");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains (@text,'Add Task')]")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View[contains (@resource-id , 'tasksList')]")));
        WebElement tasksList=driver.findElement(AppiumBy.xpath("//android.view.View[contains (@resource-id , 'tasksList')]"));
        List<WebElement> tasks = tasksList.findElements(AppiumBy.className("android.widget.TextView"));
        System.out.println("No of tasks: " + tasks.size());

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add tasks to list']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Get number of tasks']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Clear the list']")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains (@text,' Clear List')]")).click();

        List<WebElement> tasksAfterClear = tasksList.findElements(AppiumBy.className("android.widget.TextView"));
        System.out.println("No of tasks: " + tasksAfterClear.size());
        Assert.assertEquals(tasksAfterClear.size(),0);
    }

}
