package org.fasttrackit1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishlistTest {


    @Test
    public void wishlist() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
        loginLink.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("bula89@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement accountButton1 = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton1.click();
        WebElement WishListButton = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a"));
        WishListButton.click();
        driver.quit();

    }

    @Test
    public void notloggedin() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        WebElement accountButton = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountButton.click();
        WebElement WishListButton = driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a"));
        WishListButton.click();
    }

    @Test
    public void searchButton() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
    WebElement searchButton = driver.findElement(By.cssSelector("button.search-button"));
        searchButton.click();

}

    @Test
    public void productButton() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#search")).sendKeys("AVIATOR SUNGLASSES");
        WebElement searchButton = driver.findElement(By.cssSelector("button.search-button"));
        searchButton.click();
        WebElement addCart = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > button > span > span"));
        addCart.click();

    }
}