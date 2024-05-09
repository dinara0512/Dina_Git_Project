package com.company_name.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateHeader {

    public static void validateHeader (String url) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        WebElement header = driver.findElement(By.xpath("//h1"));
        String headerText = header.getText();
        if (header.isDisplayed()) {
            System.out.println("Header is displayed");
        } else {
            System.out.println("Header is NOT displayed");
        }
    }

    public static void main(String[] args) {
        validateHeader("https://rahulshettyacademy.com/AutomationPractice/");
    }
}
