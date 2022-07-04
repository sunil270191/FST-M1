package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


import java.time.Duration;

public class Live_Project8 {

    public static void main (String[] args) {
        WebDriver driver;
        WebDriverWait wait;


            //driver initialise
            driver = new FirefoxDriver();
            wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.manage().window().maximize();
            //open Firefox browser
            driver.get("http://alchemy.hguy.co/crm");



            //login credentials

            driver.findElement(By.id("user_name")).sendKeys("admin");
            driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
            driver.findElement(By.id("bigbutton")).click();

            WebElement homePage = driver.findElement(By.xpath("//a[@class='navbar-brand with-home-icon suitepicon suitepicon-action-home']"));
            //login successful verification
            if (homePage.isDisplayed()) {
                Reporter.log("Login Successful");
            } else {
                Reporter.log("Login Unsuccessful");
            }



            //Navigate to Sales--> Accounts
            driver.findElement(By.id("grouptab_0")).click();
            driver.findElement(By.id("moduleTab_9_Accounts")).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='list view table-responsive']/tbody")));

            for (int i = 1; i <= 10; i++) {
                //Printing first 5 Names of oddrows
                String oddRowName = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[" + i + "]/td[3]/b/a")).getText();
                System.out.println("Row Num: " + i + "->" + oddRowName);
                i++;
            }





            //close browser

            driver.quit();

    }

}
