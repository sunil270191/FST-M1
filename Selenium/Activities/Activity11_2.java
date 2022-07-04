package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String PageTitle= driver.getTitle();

        System.out.println("The page title is :" +PageTitle);

        WebElement confirmAlert= driver.findElement(By.cssSelector("#confirm"));
        confirmAlert.click();

        Alert AlertConfirm=driver.switchTo().alert();

        System.out.println("The confirm alert Text is :"+AlertConfirm.getText());

        //accept the alert

        AlertConfirm.accept();

        //dismiss alert

        //AlertConfirm.dismiss();

        //closing the browser

        driver.close();
    }
}
