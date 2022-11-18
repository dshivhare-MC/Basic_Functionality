package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnBasics
{
    public static void main(String[] args)
    {
        //System.out.println("Hello");

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        WebElement element= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));

        Actions action = new Actions(driver);

        action.moveToElement(element).click().perform();

        WebElement mobile = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
        mobile.sendKeys("9315859457");

        WebElement Cont = driver.findElement( By.xpath("//*[@id=\"continue\"]"));
        Cont.click();

        WebElement pass = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
        pass.sendKeys("Deepu@123");

        WebElement signIn = driver.findElement( By.xpath("//*[@id=\"signInSubmit\"]"));
        signIn.click();


    }
}
