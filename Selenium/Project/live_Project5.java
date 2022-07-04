package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class live_Project5 {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        String color=driver.findElement(By.xpath("//*[@id=\"toolbar\"]")).getCssValue("color");
        System.out.println(" the color of tool bar is : "+color);
    }
}
