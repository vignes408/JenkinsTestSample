package com.vickee.seleniumtestex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MobileHomeTest2 {

		  @Test
		  void testDel() {
			  WebDriver driver = new ChromeDriver();
			  	driver.get("http://localhost:3000/");
			    driver.findElement(By.linkText("VIEWREPAIR")).click();
			    driver.findElement(By.cssSelector("tr:nth-child(3) .ms-1")).click();
			    assertEquals("Do you want to delete", "Do you want to delete");
			    assertEquals("Data has deleted","Data has deleted");
		    }
	}

