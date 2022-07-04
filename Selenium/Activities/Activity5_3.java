package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args)
    {
        // opening the webdriver
        WebDriver driver= new FirefoxDriver();
        //get the web page
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Page title
        String page= driver.getTitle();
        System.out.println("The page title is:"+page);
        WebElement textBox=driver.findElement(By.xpath("//*[@id=\"input-text\"]"));
        boolean status = textBox.isEnabled();
        System.out.println(status);
        driver.findElement(By.xpath("//*[@id=\"toggleInput\"]")).click();
        status = textBox.isEnabled();
        System.out.println("After Enable:"+status);
        driver.close();

    }
}
