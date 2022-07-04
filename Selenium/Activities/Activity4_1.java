package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String pageTitle= driver.getTitle();
        System.out.println("The page title : "+pageTitle);

        WebElement aboutUs= driver.findElement(By.xpath("/html/body/div/div/div/a"));
        aboutUs.click();
        String newTitle= driver.getTitle();
        System.out.println("The new page title : "+newTitle);

        driver.close();
    }
}
