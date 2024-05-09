package com.company_name.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class Selenium_basic_concepts {
    //Opening and Closing Browsers
    public static void validateDropDown(String url)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);
        //WebElement alertButton = driver.findElement(By.id("name"));
      //  WebElement iFrame = driver.findElement(By.id("frame1Wrapper"));
        driver.switchTo().frame(0);

       // WebElement heading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
       // Assert.assertEquals(heading.getText(),"This is a sample page");
      //  Thread.sleep(5000);
        driver.switchTo().defaultContent();
        driver.get("https://www.google.com/");
       // driver.switchTo().window(url);
        //WebElement header=driver.findElement(By.xpath(""));
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        validateDropDown("https://demoqa.com/frames");
    }


}
