package automation_tasks;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_handling {
    /*
    Go to url "https://rahulshettyacademy.com/AutomationPractice/"
    scroll down then use faker library to insert name to alert and accept the alert
     */
    public static void validateAlert(String url) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        WebElement alertButton = driver.findElement(By.id("name"));
        actions.scrollToElement(alertButton).perform();
        Thread.sleep(5000);
        alertButton.click();
        Faker faker = new Faker();
        alertButton.sendKeys(faker.name().firstName());
        WebElement confirmButton = driver.findElement(By.id("alertbtn"));
        confirmButton.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        validateAlert("https://rahulshettyacademy.com/AutomationPractice/");

    }
}
