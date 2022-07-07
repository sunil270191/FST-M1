package LiveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity1 {
   AndroidDriver driver;
   WebDriverWait wait;

   @BeforeClass
   public void setUP() throws MalformedURLException
   {
       UiAutomator2Options options=new UiAutomator2Options();
       options.setPlatformName("android");
       options.setDeviceName("realme 8s 5G");
       options.setAppPackage("com.google.android.apps.tasks");
       options.setAppActivity(".ui.TaskListsActivity");
       options.setAutomationName("UiAutomator2");

       URL serverURL= new URL("http://localhost:4723/wd/hub");

       //driver initialization

       driver= new AndroidDriver(serverURL,options);
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   }

   @Test
    public void addTask() {


       wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.apps.tasks:id/welcome_get_started")));


       driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/welcome_get_started")).click();

       //wait.until(ExpectedConditions.textToBePresentInElement())
       driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")));


       driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Tasks");
       driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

       wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]/android.view.ViewGroup/android.widget.TextView")));

       String title1 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]/android.view.ViewGroup/android.widget.TextView")).getText();

       System.out.println("The title 1 is :" + title1);
       Assert.assertEquals(title1, "Complete Activity with Google Tasks");

   }
   @Test
   public void addtask2()
   {
       driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")));

       driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Keep");
       driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
       String title2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]/android.view.ViewGroup/android.widget.TextView")).getText();

       System.out.println("The title 2 is :" + title2);
       Assert.assertEquals(title2, "Complete Activity with Google Keep");

   }
    @Test
    public void addTask3() {

       driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")));

       driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete the second Activity Google Keep");
       driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

       String title3=driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView")).getText();
       System.out.println("The title 3 is :"+title3);

       Assert.assertEquals(title3,"Complete the second Activity Google Keep");

   }

   @AfterClass
    public void tearDown()
   {
       driver.quit();
   }

   }
