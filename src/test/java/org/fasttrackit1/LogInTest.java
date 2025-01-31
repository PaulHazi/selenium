package org.fasttrackit1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LogInTest {
    @Test
    public void validLoginTest() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();
        driver.findElement(By.cssSelector("#email")).sendKeys("Branza@gmail.ro");
        driver.findElement(By.cssSelector("#pass")).sendKeys("sayBranza");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();


    }
}
