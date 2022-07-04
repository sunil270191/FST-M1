package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class live_Project7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));;
        driver.get("http://alchemy.hguy.co/crm");

        driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Leads\"]")).click();
        //Thread.sleep(10);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[@class='oddListRowS1'][1]/td[10]/span/span[@title='Additional Details']")));
        driver.findElement(By.xpath("(//span[@class='suitepicon suitepicon-action-info'])[1]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='phone']")));
        String phoneNumber = driver.findElement(By.xpath("//span[@class='phone']")).getText();
        System.out.println("Lead Phone Number is "+phoneNumber);

        driver.close();

    }

}
