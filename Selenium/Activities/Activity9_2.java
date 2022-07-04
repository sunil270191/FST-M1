package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args)
    {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects");

        WebElement selected=driver.findElement(By.id("multi-value"));

        Select dropdown= new Select(driver.findElement(By.id("multi-select")));

        if(dropdown.isMultiple())
        {
            dropdown.selectByVisibleText("Javascript");
            System.out.println(selected.getText());

            dropdown.selectByValue("node");
            System.out.println(selected.getText());

            for(int i=4;i<=6;i++) {
                dropdown.selectByIndex(i);

            }
            System.out.println(selected.getText());

            dropdown.deselectByValue("node");
            System.out.println(selected.getText());

            dropdown.selectByIndex(7);
            System.out.println(selected.getText());

            List<WebElement> selected_Options= dropdown.getAllSelectedOptions();

            for(WebElement option : selected_Options)
            {
                System.out.println(" selected Options :"+option.getText());
            }

            dropdown.deselectAll();
            System.out.println(selected.getText());



        }
        driver.close();
    }
}
