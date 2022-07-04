package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;

public class Live_Project9 {
    public static void main(String[] args)
    {
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



        //Navigate to Sales--> Leads
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Leads")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='list view table-responsive']/tbody")));
        System.out.println("First 10 Rows Name and Column Data");
        for (int i = 1; i <= 10; i++) {
            //Printing first 10 rows name and user columns data
            String nameColumn = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+i+"]/td[3]/b/a")).getText();

            String userColumn = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+i+"]/td[8]/a")).getText();

            System.out.println(nameColumn+" | "+userColumn);

        }






        //close browser

        driver.quit();

    }
}
