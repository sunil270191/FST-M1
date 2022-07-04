package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {

public static void main(String[] args)
{
    WebDriver driver=new FirefoxDriver();
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://training-support.net/selenium/dynamic-attributes");
    String pageTitle= driver.getTitle();
    WebElement userName= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input"));
    WebElement passWord= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input"));
    WebElement conf_passWord= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[3]/input"));
    WebElement email= driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input"));
    WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button"));

    userName.sendKeys("Suns");
    passWord.sendKeys("Password");
    conf_passWord.sendKeys("Password");
    email.sendKeys("sun@xyz");
    button.click();

    String msg=driver.findElement(By.id("action-confirmation")).getText();
    System.out.println("The message is :"+msg);

    driver.close();





}
}
