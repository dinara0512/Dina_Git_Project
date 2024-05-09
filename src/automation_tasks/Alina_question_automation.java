package automation_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Alina_question_automation {

    /*open chrome/firefox browser
    navigate to google home page
    search selenium automation
    click search button
    verify that search results page is displayed
     */

    public static void searchResults (String url) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium automation");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        driver.quit();
     //   Assert.assertEquals(driver.getTitle().contains("selenium automation"));


   //     WebElement button = driver.findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));

    }

    public static void main(String[] args) {
        searchResults("https://www.google.com/");
    }
}
