package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que4 {
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GovindRaj\\eclipse-workspace-gokul-selenium\\Selenium\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	
	d.get("https://infinity.icicibank.com/corp/Login.jsp");
	
	WebElement txtUserName = d.findElement(By.id("DUMMY1"));
	txtUserName.sendKeys("gokul");
	
     WebElement txtPassword = d.findElement(By.id("DUMMY23"));
	txtPassword.sendKeys("9940");
	
	
}
}