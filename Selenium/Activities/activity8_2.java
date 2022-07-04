package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class activity8_2 {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //Open browser
        driver.get("https://training-support.net/selenium/tables");
        //Get Columns
        List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th"));
        System.out.println(cols.size());

       // List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));

        //Get Rows
        List<WebElement> Rows= driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr"));
        System.out.println(Rows.size());

        //Cell value of second row, second column
        WebElement second_value = driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[2]/td[2]"));

        System.out.println("Before Sorting : "+second_value.getText());
        //sorting by Name
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/thead/tr/th[1]")).click();

        //After Sorting
        WebElement second_value_A = driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[2]/td[2]"));

        System.out.println("Before Sorting : "+second_value_A.getText());

        //footer values of table

        WebElement footer= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/table/tfoot/tr"));

        System.out.println("cell values of the table footer are : "+footer.getText());

        driver.close();





    }
}
