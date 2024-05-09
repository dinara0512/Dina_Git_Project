package com.company_name.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Suggestion_Class_Example {
    public static void suggestionExample (String url) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        WebElement window = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        Actions action = new Actions(driver);
        window.sendKeys("Uz");
        Thread.sleep(5000);
        WebElement dropDown = driver.findElement(By.xpath("//li[@class='ui-menu-item']"));
        action.moveToElement(dropDown).sendKeys(Keys.ENTER).perform();
        driver.quit();
    }

    public static void main(String[] args)  throws InterruptedException{
        suggestionExample("https://rahulshettyacademy.com/AutomationPractice/");
    }
}
