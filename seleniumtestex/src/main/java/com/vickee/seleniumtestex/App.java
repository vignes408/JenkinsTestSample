package com.vickee.seleniumtestex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
//        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
//        driver.switchTo().alert().accept();
//        driver.navigate().to("https://sangam.relevantz.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("btnK")).submit();    
    }
}
