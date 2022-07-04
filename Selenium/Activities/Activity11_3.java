package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main(String[] args)
    {

        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String PageTitle= driver.getTitle();

        System.out.println("The page title is :" +PageTitle);

        WebElement promptAlert= driver.findElement(By.id("prompt"));
        promptAlert.click();

        Alert Alertprompt=driver.switchTo().alert();

        System.out.println("The confirm alert Text is :"+Alertprompt.getText());

        Alertprompt.sendKeys("Yes you are");

        Alertprompt.accept();

        driver.close();


    }
}
