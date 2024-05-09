package com.company_name.automation;

import com.beust.ah.A;
import com.github.javafaker.Faker;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;

public class DragAndDrop {
    public static void dragAndDrop (String url) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement dragMe = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropBox = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(5000);
        dragMe.click();
        actions.dragAndDrop(dragMe, dropBox).perform();
        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));

        String expected = "Dropped!";
        String actual = successMessage.getText();

        assertEquals(actual, expected, "actual does not match expected");

        driver.quit();

    }

    public static void main(String[] args) throws InterruptedException{
      //dragAndDrop("https://demoqa.com/droppable");
        fillOutForm("https://demoqa.com/text-box");
    }

    public static void fillOutForm (String url) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        WebElement btnSubmit = driver.findElement(By.id("submit"));
        Actions actions = new Actions(driver);
        Faker faker = new Faker();
        fullName.sendKeys(faker.name().fullName());
        email.sendKeys(faker.internet().emailAddress());
        currentAddress.sendKeys(faker.address().fullAddress());
        permanentAddress.sendKeys(faker.address().secondaryAddress());
        btnSubmit.click();
        driver.quit();
    }

public static void checkBox (String url) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        WebElement elements = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        elements.click();
        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span[1]"));
        checkBox.click();

}


    }
