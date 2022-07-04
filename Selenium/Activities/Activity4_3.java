package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args)
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        String pageTitle= driver.getTitle();
        System.out.println("The title of the page is : "+pageTitle);

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h1"));
        WebElement thirdheader =driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        System.out.println("The third header is:"+thirdheader);

        String color=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
        System.out.println("The fifth header color is:"+color);

        String button =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
        System.out.println("The button class:"+button);

        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);

        //Close the browser
        driver.close();
    }
}
