package com.qualizeal.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C://Windows//System32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.switchTo().frame("moneyiframe");
        String nse = driver.findElement(By.id("nseindex")).getText();
        System.out.println(nse);
        driver.close();
    }
}
