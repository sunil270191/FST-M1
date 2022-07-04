package Activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");

        String pageTitle= driver.getTitle();

        System.out.println(pageTitle);

        WebElement checkbox= driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));

        WebElement toggle_button= driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
        toggle_button.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));


        toggle_button.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));

        checkbox.click();

        driver.close();
    }
}
