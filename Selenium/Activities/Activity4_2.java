package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String pageTitle= driver.getTitle();
        System.out.println("The page title : "+pageTitle);

        WebElement aboutUs= driver.findElement(By.xpath("/html/body/div/div/div/a"));
        aboutUs.click();
        String newTitle= driver.getTitle();
        System.out.println("The new page title : "+newTitle);

        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));

        firstName.sendKeys("Sunil");
        lastName.sendKeys("Subramanian");

        //Enter the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@example.com");

        //Enter the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");

        //Enter Message
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");

        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();

        driver.close();
    }
}
