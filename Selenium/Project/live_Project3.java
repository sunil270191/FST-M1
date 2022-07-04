package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class live_Project3 {

    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");

        String copyRight= driver.findElement(By.xpath("//*[@id=\"admin_options\"]")).getText();
        System.out.println("The copyright code is : "+copyRight);

        driver.close();
    }
}
