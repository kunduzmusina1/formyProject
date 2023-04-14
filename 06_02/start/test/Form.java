import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SubmitForm;
import pages.conformationPage;

import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        SubmitForm submitForm = new SubmitForm();
        SubmitForm.submitForm(driver);

        conformationPage conformationPage = new conformationPage();
        conformationPage.waitForAlertBanner(driver);

        conformationPage.getAlertText(driver);

        assertEquals("The form was successfully submitted!",conformationPage.getAlertText(driver));

        driver.quit();
    }




}
