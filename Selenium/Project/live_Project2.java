package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class live_Project2 {
    public static void main(String[] args)
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        //String img_url= driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img")).getCssValue("url");

        WebElement img = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img"));
        String src = img.getAttribute("src");
        System.out.println("The header image url is : "+src);
    }
}
