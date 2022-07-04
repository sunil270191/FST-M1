package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Activity10_2 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();
        Actions actions= new Actions(driver);
        driver.get(" https://www.training-support.net/selenium/input-events");

        String pageTitle= driver.getTitle();
        System.out.println("Page title is :"+pageTitle);

        WebElement keyPressed= driver.findElement(By.id("keyPressed"));
        Action actionSequence1 = actions.sendKeys("M").build();
        actionSequence1.perform();

        String pressedKeyText=keyPressed.getText();
        System.out.println(" The pressed key is :"+pressedKeyText);

        //Create action sequence for Spacebar
        Action actionSequence2 = actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        actionSequence2.perform();
        pressedKeyText = keyPressed.getText();
        System.out.println("Pressed key is: " + pressedKeyText);

        //Close browser
        driver.close();

    }
}
