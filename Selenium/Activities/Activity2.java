package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println(title);
        WebElement idLocator= driver.findElement(By.id("about-link"));
        System.out.println("Text in element: " + idLocator.getText());
        WebElement classLocator= driver.findElement(By.className("green"));
        System.out.println("Text in element: " + classLocator.getText());
        //Find the About Us link using cssSelector()
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssLocator.getText());

        //Find the About Us link using linkText()
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());

        //Close the browser
        driver.close();
    }
}
