package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String pageTitle=driver.getTitle();
        System.out.println("The tile is : "+pageTitle);

        WebElement firstName=driver.findElement(By.id("firstName"));
        WebElement lastName= driver.findElement(By.id("lastName"));
        WebElement email=driver.findElement(By.id("email"));
        WebElement phoneNumber=driver.findElement(By.id("number"));

        firstName.sendKeys("Sunil");
        lastName.sendKeys("Subramanian");
        email.sendKeys("sunil2701.ss@gmail.com");
        phoneNumber.sendKeys("8754539791");

        WebElement button= driver.findElement(By.cssSelector(".ui.green.button"));
        button.click();

        driver.close();


    }
}
