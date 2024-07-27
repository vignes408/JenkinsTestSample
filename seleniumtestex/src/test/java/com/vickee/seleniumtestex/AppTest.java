package com.vickee.seleniumtestex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AppTest {

	@Test
	void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		assertEquals("Google",driver.getTitle());
	}

}
