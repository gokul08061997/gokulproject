package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GovindRaj\\eclipse-workspace-gokul-selenium\\Selenium\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.redbus.in/");
	
	WebElement txtFrom = d.findElement(By.id("src"));
	
	txtFrom.sendKeys("Chennai");
	
	WebElement txtTo = d.findElement(By.id("dest"));
	
	txtTo.sendKeys("Thiruvannamalai");
	
}

}
