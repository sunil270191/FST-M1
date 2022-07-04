package Live_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Live_Project {
    WebDriver driver;

    @BeforeClass
    public void setUp()
    {
        //Open a browser
        driver= new FirefoxDriver();

        // Navigate to ‘http://alchemy.hguy.co/crm’.
        driver.get("https://alchemy.hguy.co/crm/");
    }
    @Test
    public void tiTle_Validation()
    {
        // Get the title of the website
        String pageTitle= driver.getTitle();

        //Make sure it matches “SuiteCRM” exactly.
        Assert.assertEquals(pageTitle,"SuiteCRM");
    }
    @AfterClass
    public void tearDown()
    {
        //If it matches, close the browser.
        driver.close();
    }

}
