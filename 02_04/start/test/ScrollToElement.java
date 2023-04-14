import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement text = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(text);
        text.sendKeys("MK");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01.11.12");



        driver.quit();
    }
}
