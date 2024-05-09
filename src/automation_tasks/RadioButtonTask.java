package automation_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButtonTask {
    public static void validateRadioButton (String url) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        Thread.sleep(5000);
        WebElement radioButton1 = driver.findElement(By.xpath("//input[@value=\'radio1\']"));
        WebElement radioButton2 = driver.findElement(By.xpath("//input[@value=\'radio2\']"));
        WebElement radioButton3 = driver.findElement(By.xpath("//input[@value=\'radio3\']"));
        Actions action = new Actions(driver);
        //action.click(radioButton2);
        radioButton2.click();
        Thread.sleep(5000);
        System.out.println(radioButton2.isSelected() + " after clicking");
        System.out.println(radioButton2.isEnabled()+" is enabled");
       // action.click(radioButton3);
        System.out.println(radioButton3.isEnabled()+" is enabled");
        System.out.println(radioButton1.isDisplayed()+" is displayed");
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        validateRadioButton("https://rahulshettyacademy.com/AutomationPractice/");
    }
}
