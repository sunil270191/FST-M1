package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/ajax");

        String pageTitle = driver.getTitle();

        System.out.println(pageTitle);

        WebElement changeContent= driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button"));
        changeContent.click();

        String text1=driver.findElement(By.xpath("//*[@id=\"ajax-content\"]")).getText();

        System.out.println("The First text1"+text1);

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

        String text2=driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h3")).getText();

        System.out.println("The second Text is: "+text2);

        driver.close();

    }

}
