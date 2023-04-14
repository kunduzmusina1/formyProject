import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement button = driver.findElement(By.id("dropdownMenuButton"));
        button.click();

        WebElement autocomplete = driver.findElement(By.id("dropdownMenuButton"));
        autocomplete.click();


        driver.quit();
    }
}
