package com.vickee.seleniumtestex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IniaproTest {
	
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://iniapro.relevantz.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("vigneswaran.rajesh");
        driver.findElement(By.name("password")).sendKeys("Meevickee@482002");
        driver.findElement(By.name("login")).submit();    
        
	}
}
