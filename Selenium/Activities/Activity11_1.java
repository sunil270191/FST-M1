package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String PageTitle= driver.getTitle();

        System.out.println("The page title is :" +PageTitle);

        WebElement simpleAlert= driver.findElement(By.id("simple"));
        simpleAlert.click();

        Alert alertSimple= driver.switchTo().alert();

        //String alertText= alertSimple.getText();

        System.out.println("The Alert Text is :"+alertSimple.getText());

        alertSimple.accept();

        driver.close();
    }
}
