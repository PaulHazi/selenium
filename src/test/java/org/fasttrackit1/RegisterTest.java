package org.fasttrackit1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterTest {
    @Test
    public void RegisterTest1() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement registerButton = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a"));
        registerButton.click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Ionel");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Branza");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("Branza@gmail.ro");
        driver.findElement(By.cssSelector("#password")).sendKeys("sayBranza");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("sayBranza");
        WebElement newsletterBox = driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label"));
        newsletterBox.click();
        WebElement registerButton1 = driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span"));
        registerButton1.click();
        driver.quit();

    }
}