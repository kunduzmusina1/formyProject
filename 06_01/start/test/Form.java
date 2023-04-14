import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.id("first-name")).sendKeys("April");

        driver.findElement(By.id("last-name")).sendKeys("May");

        driver.findElement(By.id("job-title")).sendKeys("Creator");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-3")).click();

        driver.findElement(By.id("select-menu")).click();

        driver.findElement(By.cssSelector("option[value='3']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("12.12.2024");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();



        driver.quit();
    }
}
