package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GovindRaj\\eclipse-workspace-gokul-selenium\\Selenium\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.swiggy.com/");
		
	WebElement txtLocation = d.findElement(By.id("location"));
	
	txtLocation.sendKeys("Chennai");
	
	
	}
}
