package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args)
    {
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String pageTitle= driver.getTitle();
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input")).sendKeys("password");

        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Welcome Back, admin"));

        WebElement text1= driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));

        System.out.println("The success message is :"+text1.getText());


    }
}
